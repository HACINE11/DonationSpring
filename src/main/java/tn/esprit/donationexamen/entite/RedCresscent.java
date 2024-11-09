package tn.esprit.donationexamen.entite;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
public class RedCresscent {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long redCID;
    private String area;

    @OneToMany
    private List<Donation> donations;
}
