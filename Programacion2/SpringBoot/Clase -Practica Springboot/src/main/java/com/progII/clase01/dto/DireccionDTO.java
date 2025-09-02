package com.progII.clase01.dto;

import com.progII.clase01.enums.TipoDireccion;
import com.progII.clase01.model.Cliente;
import jakarta.persistence.*;
import lombok.Builder;
import lombok.Data;

@Data
@Builder

public class DireccionDTO {
    private int id;

    private String calle;
    private String numero;
    private String entreCalles;
    private String barrio;
    private String ciudad;
    private TipoDireccion tipoDireccion;
    private ClienteDTO cliente;
  }

