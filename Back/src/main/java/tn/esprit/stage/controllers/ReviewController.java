package tn.esprit.stage.controllers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.stage.entities.Review;
import tn.esprit.stage.services.IReviewService;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/auth")
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
public class ReviewController {

    private IReviewService iReviewService;

    @PostMapping("/addReviewAndAssignToUserAndToOffre/{idUser}/{idOffre}")
    public Review addOffreAndAssignToUserAndToSession(@PathVariable Long idUser, @RequestBody Review o, @PathVariable Long idOffre){
        return iReviewService.addReviewAndAssignToUserAndToOffre(idUser,o,idOffre);
    }
    @GetMapping("/reviews/{idOffer}/{idUser}")
    public Review getReviewByOfferIdAndUserId(@PathVariable Long idOffer, @PathVariable Long idUser) {
        return iReviewService.findReviewByOfferIdAndUserId(idOffer, idUser);
    }
}
