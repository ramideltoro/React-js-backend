package com.example.paulinabackend.signin;


import com.example.paulinabackend.signup.SignUpForm;
import com.example.paulinabackend.signup.SignUpStatus;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@Slf4j
@CrossOrigin
@RestController
@RequestMapping("signin")
public class SignInController {

    private final SignInHandler signInHandler;

    @PostMapping
    public SignInStatus signIn(@RequestBody final UserCredentials userCredentials) {
        log.info("Received a SignIn ...{}",userCredentials);
        final boolean isValidUser = signInHandler.isValidUser(userCredentials);

        return SignInStatus.builder()
                .isValidUser(Boolean.toString(isValidUser))
                .build();
    }
}
