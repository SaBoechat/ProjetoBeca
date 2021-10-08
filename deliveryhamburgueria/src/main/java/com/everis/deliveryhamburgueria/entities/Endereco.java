package com.everis.deliveryhamburgueria.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Endereco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idenderecos;
    private String logradouro;
    private String endereco;
    private String complemento;

    public void Enderecos(String logradouro, String endereco, String complemento) {
        this.logradouro = logradouro;
        this.endereco = endereco;
        this.complemento = complemento;
    }

    public void Enderecos() {

    }
    
}  
    
    
    