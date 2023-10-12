package me.dio.bruno.santanderdevweek.service.impl;

import me.dio.bruno.santanderdevweek.model.User;
import me.dio.bruno.santanderdevweek.repository.UserRepository;
import me.dio.bruno.santanderdevweek.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User findByID(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User creat(User userToCreated) {
        if(userRepository.existsByAccountNumber(userToCreated.getAccount().getNumber())){
            throw new IllegalArgumentException("This account number already exists.");
        }

        return userRepository.save(userToCreated);
    }
}
