package com.inno.bookseller.service.serviceImpl;

import com.inno.bookseller.dtos.UserSignUpDto;
import com.inno.bookseller.model.User;
import com.inno.bookseller.repositories.UserRepository;
import com.inno.bookseller.service.UserService;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User userSignUp(UserSignUpDto userSignUpDto) {
        User user = new User();
        user.setName(userSignUpDto.getName());
        user.setEmail(userSignUpDto.getEmail());
        user.setPassword(userSignUpDto.getPassword());
        return userRepository.save(user);
    }
}
