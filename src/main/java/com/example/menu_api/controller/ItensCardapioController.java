package com.example.menu_api.controller;

import com.example.menu_api.model.ItensCardapio;
import com.example.menu_api.repository.ItensCardapioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/cardapio")
public class ItensCardapioController {

    @Autowired
    private ItensCardapioRepository repository;

    @GetMapping
    public List<ItensCardapio> listar() {
        return repository.findAll();
    }
}