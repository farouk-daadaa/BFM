package tn.esprit.stage.services;

import com.twilio.Twilio;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;


@Service

@Slf4j
public class PhoneVerificationService {

    private final String ACCOUNT_SID = "AC04b92425e75803001c11e5c2ea45cdd0";
    private final String AUTH_TOKEN = "a552991476507bf616bd4a0ad280dcb5";
    private final String TWILIO_PHONE_NUMBER = "+12563028724";

    public PhoneVerificationService() {
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
    }

    public void sendVerificationCode(String phoneNumber, String verificationCode) {
      /*  Message.creator(
                        new PhoneNumber(phoneNumber),
                        new PhoneNumber(TWILIO_PHONE_NUMBER),
                        "Your verification code is: " + verificationCode)
                .create();
    */}

    public boolean verifyCode(String userInputCode, String storedVerificationCode) {
        return userInputCode.equals(storedVerificationCode);
    }
}
