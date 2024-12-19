package tn.esprit.stage.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stage.entities.Materiel;
import tn.esprit.stage.repositories.MaterielRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class MaterielServiceImp implements IMaterielService{

    MaterielRepository materielRepository;
    @Override
    public Materiel addMateriel(Materiel materiel) {
        return materielRepository.save(materiel);
    }

    @Override
    public List<Materiel> retrieveAllMateriel() {
        return materielRepository.findAll();
    }

    @Override
    public Materiel updateMateriel(Materiel materiel) {
        return materielRepository.save(materiel);
    }

    @Override
    public Materiel retrieveMateriel(Long id) {
        return materielRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("no materiel found with this id " + id));
    }
    @Override
    public void deleteMateriel(Long id) {
        materielRepository.deleteById(id);
    }
}

