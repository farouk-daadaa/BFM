package tn.esprit.stage.services;

import tn.esprit.stage.entities.Feedback;

import java.util.List;

public interface IFeedbackService {
    public Feedback addFeedbackAndAssignFeedbackToUser (long idUser , Feedback f);

    public List<Feedback> getAllFeedback();
}
