package com.everis.deliveryhamburgueria.dtos.responses;

import lombok.Data;

@Data
public class ClienteResponse {

    private Long id;
    private String nome;
    private String sobrenome;
    private String status;

}
