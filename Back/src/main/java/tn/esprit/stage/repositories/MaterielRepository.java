package tn.esprit.stage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stage.entities.Materiel;
import tn.esprit.stage.entities.Pack;

import java.util.List;

public interface MaterielRepository extends JpaRepository<Materiel,Long> {

    List<Materiel> findByPack(Pack pack);
}