package tn.esprit.stage.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.stage.entities.AuthenticateResponse;
import tn.esprit.stage.entities.User;

@Service
@AllArgsConstructor
public class PasswordResetTokenService {

    public void createPasswordResetTokenUser(User user , String token){

        AuthenticateResponse response = new AuthenticateResponse();
    }
}
