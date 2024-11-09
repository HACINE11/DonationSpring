package tn.esprit.donationexamen.entite;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.util.Date;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
public class Donation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long donId;
    private float amount;
    @Temporal(TemporalType.DATE)
    private Date date;
    @Enumerated(EnumType.STRING)
    private DonationType donationType;
    @ManyToOne(cascade = CascadeType.MERGE)
    private Employ employ;

}
