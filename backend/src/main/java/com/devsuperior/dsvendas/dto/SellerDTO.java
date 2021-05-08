package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entity.SellerEntity;

import java.io.Serializable;

public class SellerDTO implements Serializable { // Serializable é para os objetos sejam convertidos para bytes

    private Long id;
    private String name;

    public SellerDTO(){

    }

    public SellerDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public SellerDTO(SellerEntity sellerEntity) {
        id = sellerEntity.getId();
        name = sellerEntity.getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
