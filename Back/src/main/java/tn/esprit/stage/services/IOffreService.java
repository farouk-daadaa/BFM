package tn.esprit.stage.services;

import tn.esprit.stage.entities.Offre;

import java.util.List;


public interface IOffreService {
    public Offre addOffre(Offre o);
    public List<Offre> getAllOffres() ;
    public Offre getOffreById(long idOffre);
    public void deleteOffre(long idOffre);
    public Offre updateOffre(Offre o);
    public List<Offre> getOffresByUserId(Long id);
    public Offre addOffreAndAssignToUserAndToSession(Long idUser, Offre offre, Long idSession);
    List<Offre> findAllWithReviews();

}

