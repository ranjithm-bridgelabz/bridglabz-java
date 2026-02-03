package com.java.JavaRegex.UserRegistration;

import java.util.regex.Pattern;

public class UserRegistrationUtil {

    // /UC1
    // What we do:
    // - First name must start with Capital letter
    // - Minimum 3 characters
    public static boolean validateFirstName(String firstName) {
        return Pattern.matches("^[A-Z][a-z]{2,}$", firstName);
    }

    // /UC2
    // What we do:
    // - Last name must start with Capital letter
    // - Minimum 3 characters
    public static boolean validateLastName(String lastName) {
        return Pattern.matches("^[A-Z][a-z]{2,}$", lastName);
    }

    // /UC3
    // What we do:
    // - Validate email format
    // - Proper @ and . position
    // - Example: abc.xyz@bl.co.in
    public static boolean validateEmail(String email) {
        String regex =
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@" +
                        "[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2})?$";
        return Pattern.matches(regex, email);
    }

    // /UC4
    // What we do:
    // - Mobile number must have country code
    // - Space after country code
    // - 10 digit mobile number
    // Example: 91 9919819801
    public static boolean validateMobile(String mobile) {
        return Pattern.matches("^[0-9]{2} [0-9]{10}$", mobile);
    }

    // /UC5 /UC6 /UC7 /UC8
    // What we do:
    // - Minimum 8 characters
    // - At least 1 Uppercase letter
    // - At least 1 Numeric digit
    // - Exactly 1 Special character
    public static boolean validatePassword(String password) {
        String regex =
                "^(?=.*[A-Z])" +                 // UC6
                        "(?=.*[0-9])" +                   // UC7
                        "(?=[^@#$%^&*!]*[@#$%^&*!][^@#$%^&*!]*$)" + // UC8
                        ".{8,}$";                          // UC5
        return Pattern.matches(regex, password);
    }
}

