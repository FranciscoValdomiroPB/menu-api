package com.example.menu_api.repository;

import com.example.menu_api.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByLoginAndPassword(String login, String password);
}