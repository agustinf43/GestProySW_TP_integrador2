package com.progII.clase01.mapper;

import com.progII.clase01.dto.ClienteDTO;
import com.progII.clase01.model.Cliente;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(uses = DireccionMapper.class)
public interface ClienteMapper {


  ClienteDTO toClienteDTO(Cliente cliente);

  Cliente toCliente(ClienteDTO clienteDTO);
}