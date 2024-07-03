package com.cms.entities;

import java.security.SecureRandom;

public class OTPGenerator {

    private static final String CHARACTERS = "0123456789";
    private static final int OTP_LENGTH = 6; // Length of the OTP

    public static String generateOTP() {
        SecureRandom random = new SecureRandom();
        StringBuilder otp = new StringBuilder(OTP_LENGTH);
        
        for (int i = 0; i < OTP_LENGTH; i++) {
            otp.append(CHARACTERS.charAt(random.nextInt(CHARACTERS.length())));
        }
        
        return otp.toString();
    }
}

