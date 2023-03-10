package com.inno.bookseller.dtos;

import lombok.Data;

@Data
public class UserSignUpDto {
    private String name;
    private String email;
    private String password;
}
