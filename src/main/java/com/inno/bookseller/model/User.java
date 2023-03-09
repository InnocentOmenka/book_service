package com.inno.bookseller.model;

import com.inno.bookseller.enums.Role;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Getter
@Setter

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "username", unique = true, nullable = false, length = 100)
    private String username;
    @Column(name = "password", nullable = false, length = 100)
    private String password;
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    @Column(name = "create_time", nullable = false)
    private LocalDateTime createTime;
    @Enumerated(EnumType.STRING)
    @Column(name = "role", nullable = false)
    private Role role;
}
