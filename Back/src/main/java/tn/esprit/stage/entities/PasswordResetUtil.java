package tn.esprit.stage.entities;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class PasswordResetUtil {
    private String username   ;
    private String newPassword ;
    private String confirmPassword ;
}
