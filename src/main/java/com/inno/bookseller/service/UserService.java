package com.inno.bookseller.service;

import com.inno.bookseller.dtos.UserSignUpDto;
import com.inno.bookseller.model.User;

public interface UserService {
    User userSignUp(UserSignUpDto studentSignUpDto);
}
