package tn.esprit.donationexamen.entite;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString

public class Company implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long campanyid;
    @Column(nullable = false)
    private String campanyname;
    private String address  ;

    @OneToMany(mappedBy = "company")
    private List<Employ> employList;

}
