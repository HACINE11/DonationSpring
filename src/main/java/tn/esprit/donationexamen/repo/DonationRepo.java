package tn.esprit.donationexamen.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.donationexamen.entite.Donation;

public interface DonationRepo extends JpaRepository<Donation, Long> {


}
