package tn.esprit.stage.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.stage.entities.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}
