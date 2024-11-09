package tn.esprit.donationexamen.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.donationexamen.entite.Company;

public interface CompanyRepo extends JpaRepository<Company, Long> {

    public Company findByCampanyname(String campanyname);
}
