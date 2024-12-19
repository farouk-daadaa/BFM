package tn.esprit.stage.services;

import tn.esprit.stage.entities.Reclamation;

import java.util.List;

public interface IReclamationService {
    Reclamation addReclamation(Reclamation r) ;
    public List<Reclamation> getAllReclamations();
    public List<Reclamation> getReclamationsByUserId(Long id);




    public Reclamation getReclamationById(long idReclamation);
    public void deleteReclamation(long idReclamation);
    public Reclamation updateReclamation(Reclamation r);
    public Reclamation addReclamationAndAssignReclamationToUser (long idUser , Reclamation reclamation);

}