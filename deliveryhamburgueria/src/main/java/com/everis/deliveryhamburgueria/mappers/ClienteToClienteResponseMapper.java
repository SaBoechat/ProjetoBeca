package com.everis.deliveryhamburgueria.mappers;

import com.everis.deliveryhamburgueria.dtos.responses.ClienteResponse;
import com.everis.deliveryhamburgueria.entities.Cliente;
import org.mapstruct.Mapper;

@Mapper
public interface ClienteToClienteResponseMapper {
    public ClienteResponse toDto(Cliente cliente);
}
