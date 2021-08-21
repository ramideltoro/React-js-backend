package com.example.paulinabackend.signup;



import lombok.Data;

import javax.persistence.*;

/*
    Step 4 : Create JPA Entity object so you can easily work with the database
    and let Spring/JPA handle the connection.
 */
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;

    private String lastName;

    private String password;

    private String email;

    public User() {}

    public User(final SignUpForm signUpForm) {
        firstName = signUpForm.getFirstName();
        lastName = signUpForm.getLastName();
        password = signUpForm.getPassword();
        email = signUpForm.getEmailAddress();
    }
}
