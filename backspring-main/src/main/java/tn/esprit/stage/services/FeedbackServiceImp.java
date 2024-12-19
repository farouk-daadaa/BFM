package tn.esprit.stage.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stage.entities.Feedback;
import tn.esprit.stage.entities.User;
import tn.esprit.stage.repositories.FeedbackRepository;
import tn.esprit.stage.repositories.UserRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FeedbackServiceImp implements IFeedbackService{

    FeedbackRepository feedbackRepository;
    UserRepository userRepository;
    @Override
    public Feedback addFeedbackAndAssignFeedbackToUser(long idUser, Feedback f) {
        User user = userRepository.findById(idUser).orElse(null);
        if (user != null) {
            f.setUser(user);
            userRepository.save(user);
            return feedbackRepository.save(f);
        } else {
            return null;
        }

    }

    @Override
    public List<Feedback> getAllFeedback() {
        return feedbackRepository.findAll();
    }
}
