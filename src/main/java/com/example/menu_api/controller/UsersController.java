package com.example.menu_api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.menu_api.dto.LoginDTO;
import com.example.menu_api.model.Users;
import com.example.menu_api.repository.UsersRepository;

@RestController
@RequestMapping("/auth")
public class UsersController {

    @Autowired
    private UsersRepository repository;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody LoginDTO dto) {
        Optional<Users> user = repository.findByLoginAndPassword(dto.getLogin(), dto.getPassword());
        if (user.isPresent()) {
            return ResponseEntity.ok("Login aprovado!");
        } else {
            return ResponseEntity.status(401).body("Usuário ou senha incorretos!");
        }
    }
}