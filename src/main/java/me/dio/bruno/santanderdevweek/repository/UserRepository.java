package me.dio.bruno.santanderdevweek.repository;

import me.dio.bruno.santanderdevweek.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
