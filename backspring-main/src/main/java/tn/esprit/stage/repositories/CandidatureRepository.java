package tn.esprit.stage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stage.entities.Candidature;
import tn.esprit.stage.entities.Status;

import java.util.List;

public interface CandidatureRepository extends JpaRepository<Candidature, Long> {
    List<Candidature> findByUserId(Long idUser);
    List<Candidature> findByOffreIdOffre(Long idOffre);

    int countCandidatureByStatusAndOffreIdOffre(Status status, long idOffre);

}
