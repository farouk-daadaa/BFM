package tn.esprit.stage.entities;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ModifyUserProfileRequest {
    private String oldPassword;
    private String newPassword;
    private String username;
    private String email;
    private String tel;
    private String image;
}
