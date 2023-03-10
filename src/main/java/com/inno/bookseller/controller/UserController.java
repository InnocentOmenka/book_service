package com.inno.bookseller.controller;

import com.inno.bookseller.dtos.UserSignUpDto;
import com.inno.bookseller.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")

public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/sign-up")
    public ResponseEntity<String> signUp(@RequestBody UserSignUpDto userSignUpDto){
        userService.userSignUp(userSignUpDto);
        return new ResponseEntity<>("sign up successfully", HttpStatus.CREATED);
    }


}
