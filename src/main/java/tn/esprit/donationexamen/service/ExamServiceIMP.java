package tn.esprit.donationexamen.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.donationexamen.entite.Company;
import tn.esprit.donationexamen.entite.Donation;
import tn.esprit.donationexamen.entite.DonationType;
import tn.esprit.donationexamen.entite.Employ;
import tn.esprit.donationexamen.repo.CompanyRepo;
import tn.esprit.donationexamen.repo.DonationRepo;
import tn.esprit.donationexamen.repo.EmployRepo;
import tn.esprit.donationexamen.repo.RedCrescentRepo;

import static tn.esprit.donationexamen.entite.DonationType.MONETARY;

@Service
@AllArgsConstructor
public class ExamServiceIMP implements IExamService {

    private CompanyRepo companyRepo;
    private DonationRepo donationRepo;
    private EmployRepo employRepo;
    private RedCrescentRepo redCrescentRepo;

    @Override
    public Company addCompany(Company company) {
        return companyRepo.save(company);
    }

    @Override
    public Employ addEmployAndAssignToCompany(Employ employ, String campanyname) {
        Company company = companyRepo.findByCampanyname(campanyname);
        employ.setCompany(company);

        return employRepo.save(employ);
    }

    @Override
    public Donation addDonation(Donation donation) {
        if (donation.getDonationType() == DonationType.MONETARY) {
            if (donation.getAmount() <= 0) {
                throw new IllegalArgumentException("Amount Required!!!");
            }
        } else {
            donation.setAmount(0); // Par exemple, seulement pour les dons non monétaires
        }
        return donationRepo.save(donation);
    }
}