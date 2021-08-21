package com.example.paulinabackend.signin;

import com.example.paulinabackend.signup.User;
import com.example.paulinabackend.signup.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class SignInHandler {

    private final UserRepository userRepository;

    public boolean isValidUser(final UserCredentials userCredentials) {

        final User user = userRepository.findUserByEmailAndPassword(userCredentials.getEmailAddress(), userCredentials.getPasswordHash());

        return user != null;
    }
}
