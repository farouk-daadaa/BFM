package tn.esprit.stage.services;

import tn.esprit.stage.entities.Review;

public interface IReviewService {
    public Review addReviewAndAssignToUserAndToOffre(Long idUser, Review review, Long idOffre);
    Review findReviewByOfferIdAndUserId(Long idOffer, Long idUser);

}
