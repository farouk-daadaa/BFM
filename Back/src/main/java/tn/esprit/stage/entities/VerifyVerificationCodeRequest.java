package tn.esprit.stage.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class VerifyVerificationCodeRequest {
    private String username ;
    private String verificationCode;
}

