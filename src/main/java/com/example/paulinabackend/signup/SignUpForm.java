package com.example.paulinabackend.signup;

import lombok.Data;

@Data
public class SignUpForm {

    private String firstName;
    private String lastName;
    private String emailAddress;
    private String password;
}
