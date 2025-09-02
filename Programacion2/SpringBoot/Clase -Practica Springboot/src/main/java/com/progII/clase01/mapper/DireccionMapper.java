package com.progII.clase01.mapper;

import com.progII.clase01.dto.DireccionDTO;
import com.progII.clase01.model.Direccion;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DireccionMapper {

  // Para evitar ciclo infinito en la relación bidireccional
  @Mapping(target = "cliente", ignore = true)
  DireccionDTO toDireccionDTO(Direccion direccion);

  @Mapping(target = "cliente", ignore = true)
  Direccion toDireccion(DireccionDTO direccionDTO);
}