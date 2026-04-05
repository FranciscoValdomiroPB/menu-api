package com.example.menu_api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class ItensCardapio {
    @Id
    private Long id;
    private String item;
    private Double preco;

    public ItensCardapio() {
    }

    public ItensCardapio(String item, Long id, Double preco) {
        this.item = item;
        this.id = id;
        this.preco = preco;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
