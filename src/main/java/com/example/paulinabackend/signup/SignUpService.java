package com.example.paulinabackend.signup;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/*
    Step 5 : create this class to handle the SignUpForm information

    In a database console window, execute :

    SELECT * FROM users

    Verify record was inserted
 */
@Slf4j
@RequiredArgsConstructor
@Service
public class SignUpService {

    private final UserRepository userRepository;

    public void handleNewSignUp(final SignUpForm signUpForm) {
        log.info("Handling new sign up.");
        final User user = new User(signUpForm);
        userRepository.save(user);
    }
}
