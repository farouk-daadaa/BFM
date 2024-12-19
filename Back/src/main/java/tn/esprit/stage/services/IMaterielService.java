package tn.esprit.stage.services;


import tn.esprit.stage.entities.Materiel;

import java.util.List;

public interface IMaterielService {
    public Materiel addMateriel(Materiel materiel);
    public List<Materiel> retrieveAllMateriel();
    public Materiel updateMateriel(Materiel materiel);
    public Materiel retrieveMateriel(Long id);
    public void deleteMateriel(Long id);
}