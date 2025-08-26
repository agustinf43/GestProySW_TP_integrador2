package com.progII.clase01.dto;

import com.progII.clase01.enums.TipoUsuario;
import com.progII.clase01.model.Direccion;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;

import java.util.Set;
@Data
@Builder
public class ClienteDTO {

  private int id;
  @NotNull
  @NotEmpty
  @Size(min=3, max=50, message = "El nombre debe tener entre 3 y 50 caracteres") //valida la longitud del campo
  private String nombre;

  @NotNull
  @NotEmpty
  @Size(min=3, max=50, message = "El nombre debe tener entre 3 y 50 caracteres") //valida la longitud del campo
  private String apellido;

  @Email
  private String email;

  private String telefono;

  TipoUsuario tipoUsuario;

  @NotEmpty
  private Set<DireccionDTO> direcciones;
}