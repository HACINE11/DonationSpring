package tn.esprit.donationexamen.service;

import tn.esprit.donationexamen.entite.Company;
import tn.esprit.donationexamen.entite.Donation;
import tn.esprit.donationexamen.entite.Employ;

public interface IExamService {

    public Company addCompany(Company company);
    public Employ addEmployAndAssignToCompany(Employ employ, String campanyname);
    public Donation addDonation(Donation donation);
}
