package tn.esprit.stage.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.stage.entities.Feedback;
import tn.esprit.stage.services.IFeedbackService;

import java.util.List;

@RequestMapping("/api/auth")
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600, allowCredentials="true")
public class FeedbackController {
    private IFeedbackService iFeedbackService;



    @PostMapping("/addFeedbackAndAssignFeedbackToUser/{idUser}")
    public Feedback addFeedbackAndAssignFeedbackToUser(@RequestBody Feedback f, @PathVariable long idUser) {
        return iFeedbackService.addFeedbackAndAssignFeedbackToUser(idUser, f);
    }

    @GetMapping("/getAllF")
    public List<Feedback> getAllFeedback(){
        return iFeedbackService.getAllFeedback();
    }


}
