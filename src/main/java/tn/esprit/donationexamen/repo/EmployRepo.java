package tn.esprit.donationexamen.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.donationexamen.entite.Employ;

public interface EmployRepo extends JpaRepository<Employ, Long> {
}
