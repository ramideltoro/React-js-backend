package com.example.paulinabackend.signin;

import lombok.Data;

@Data
public class UserCredentials {

    private String emailAddress;
    private String passwordHash;
}
