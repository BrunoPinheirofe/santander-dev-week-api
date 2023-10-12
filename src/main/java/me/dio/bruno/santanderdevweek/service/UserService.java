package me.dio.bruno.santanderdevweek.service;

import me.dio.bruno.santanderdevweek.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserService {
    User findByID(Long id);
    User creat(User userToCreated);

}
