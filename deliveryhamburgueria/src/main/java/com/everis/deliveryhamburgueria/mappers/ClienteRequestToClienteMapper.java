package com.everis.deliveryhamburgueria.mappers;

import com.everis.deliveryhamburgueria.dtos.requests.ClienteRequest;
import com.everis.deliveryhamburgueria.entities.Cliente;
import org.mapstruct.Mapper;

@Mapper
public interface ClienteRequestToClienteMapper {
    public Cliente toEntity(ClienteRequest clienteRequest);
}
