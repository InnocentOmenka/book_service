package com.inno.bookseller.security;

import com.inno.bookseller.model.User;
import com.inno.bookseller.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.boot.jackson.JsonComponent;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;

@JsonComponent
@Service
@AllArgsConstructor
public class CustomUserDetailService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByEmail(email)
                .orElseThrow(() ->
                        new UsernameNotFoundException("User not found with email: " + email));
        return new org.springframework.security.core.userdetails.User(
                user.getEmail(), user.getPassword(), Collections.singleton(new SimpleGrantedAuthority("ROLE_ADMIN")));
    }
}
