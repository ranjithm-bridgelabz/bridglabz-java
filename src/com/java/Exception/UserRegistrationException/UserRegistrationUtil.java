package com.java.Exception.UserRegistrationException;

import java.util.regex.Pattern;

public class UserRegistrationUtil {

    // /UC1
    public static void validateFirstName(String firstName)
            throws UserRegistrationException {
        if (!Pattern.matches("^[A-Z][a-z]{2,}$", firstName)) {
            throw new UserRegistrationException("Invalid First Name");
        }
    }

    // /UC2
    public static void validateLastName(String lastName)
            throws UserRegistrationException {
        if (!Pattern.matches("^[A-Z][a-z]{2,}$", lastName)) {
            throw new UserRegistrationException("Invalid Last Name");
        }
    }

    // /UC3
    public static void validateEmail(String email)
            throws UserRegistrationException {
        String regex =
                "^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)?@" +
                        "[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2})?$";

        if (!Pattern.matches(regex, email)) {
            throw new UserRegistrationException("Invalid Email");
        }
    }

    // /UC4
    public static void validateMobile(String mobile)
            throws UserRegistrationException {
        if (!Pattern.matches("^[0-9]{2} [0-9]{10}$", mobile)) {
            throw new UserRegistrationException("Invalid Mobile Number");
        }
    }

    // /UC5–UC8
    public static void validatePassword(String password)
            throws UserRegistrationException {

        String regex =
                "^(?=.*[A-Z])" +                  // UC6
                        "(?=.*[0-9])" +                    // UC7
                        "(?=[^@#$%^&*!]*[@#$%^&*!][^@#$%^&*!]*$)" + // UC8
                        ".{8,}$";                           // UC5

        if (!Pattern.matches(regex, password)) {
            throw new UserRegistrationException("Invalid Password");
        }
    }
}

