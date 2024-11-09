package tn.esprit.donationexamen.restController;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.donationexamen.entite.Company;
import tn.esprit.donationexamen.entite.Donation;
import tn.esprit.donationexamen.entite.Employ;
import tn.esprit.donationexamen.service.IExamService;

@AllArgsConstructor
@RestController
public class ExamRestController {
    private IExamService examService;
@PostMapping("/addCompany")
    public Company addCompany(@RequestBody Company company){
        return examService.addCompany(company);
    };

@PostMapping("/addEmployAndAssignToCompany/{campanyname}")
    public Employ addEmployAndAssignToCompany(@RequestBody Employ employ, @PathVariable String campanyname){

        return examService.addEmployAndAssignToCompany(employ, campanyname);
    }

    @PostMapping("/addDonation")
    public Donation addDonation(@RequestBody Donation donation){
     return examService.addDonation(donation);

    };
}
