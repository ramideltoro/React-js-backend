package com.example.paulinabackend.signup;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/*
    Step 2:
        1. Create @RestController
        2. Define @RequestMapping("signup")
        3. Create class SignupForm that maps the input json
        4. Create @PostMapping

        Test with postman, POST a json and verify if by logging body
        URL : localhost:8080/signup
        HTTP Method : Post
        Body :

        {
            "firstName" : "Rami",
            "lastName" : " Del Toro",
            "emailAddress" : "mo@mo.com",
            "password" : "hash"
        }

        NOTE : This RestController should have only one method for each HTTP method.
 */
@RequiredArgsConstructor
@Slf4j
@CrossOrigin
@RestController
@RequestMapping("signup")
public class SignUpController {

    private final SignUpService signUpService;

    @PostMapping
    public SignUpStatus postSignup(@RequestBody final SignUpForm signUpForm) {
        log.info("Received a SignUpRequest ...{}",signUpForm);
        signUpService.handleNewSignUp(signUpForm);
        return SignUpStatus.builder()
                .signupStatus("SUCCESS")
                .build();
    }
}
