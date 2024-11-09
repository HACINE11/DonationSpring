package tn.esprit.donationexamen.entite;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Employ implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long employId;
    private String lastName;
    private String firstName;
    private String position;
    @ManyToOne
    @JsonIgnore
    private Company company;
    @OneToMany(mappedBy = "employ")
    private List<Donation> donationList;
}
