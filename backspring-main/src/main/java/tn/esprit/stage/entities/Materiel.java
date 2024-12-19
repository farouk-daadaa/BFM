package tn.esprit.stage.entities;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Materiel implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMateriel ;

    private String intitule;

    private int nbPieces;
    private Pack pack;
    private double prix;

    @ManyToOne
    private Session sessions;
}
