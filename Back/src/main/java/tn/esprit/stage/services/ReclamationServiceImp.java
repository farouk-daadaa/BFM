package tn.esprit.stage.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stage.entities.Reclamation;
import tn.esprit.stage.entities.User;
import tn.esprit.stage.repositories.ReclamationRepository;
import tn.esprit.stage.repositories.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ReclamationServiceImp implements IReclamationService {
    private UserRepository userRepository;

    private ReclamationRepository reclamationReposiory;

    public Reclamation addReclamation(Reclamation r) {
        return reclamationReposiory.save(r);
    }

    @Override
    public List<Reclamation> getAllReclamations() {
        return reclamationReposiory.findAll();
    }

    @Override
    public List<Reclamation> getReclamationsByUserId(Long id) {
        return reclamationReposiory.findByUserId(id);
    }

    @Override
    public Reclamation getReclamationById(long idReclamation) {
        return reclamationReposiory.findById(idReclamation).orElse(null);
    }



    @Override
    public void deleteReclamation(long idReclamation) {
        reclamationReposiory.deleteById(idReclamation);
    }

    @Override
    public Reclamation updateReclamation(Reclamation r) {
        return reclamationReposiory.save(r);
    }

    @Override
    public Reclamation addReclamationAndAssignReclamationToUser(long idUser, Reclamation reclamation) {
        User user = userRepository.findById(idUser).orElse(null);
        if (user != null) {
            reclamation.setUser(user);
            userRepository.save(user);
            return reclamationReposiory.save(reclamation);
        } else {
            return null;
        }
    }

}
