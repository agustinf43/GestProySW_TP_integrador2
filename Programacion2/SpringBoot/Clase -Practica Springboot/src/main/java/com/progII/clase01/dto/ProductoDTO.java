package com.progII.clase01.dto;

import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Data;


@Data
@Builder
public class ProductoDTO {
  private int id;
  @NotNull
  @NotEmpty
  @Size(min=3, max=50, message = "El nombre debe tener entre 3 y 50 caracteres") //valida la longitud del campo
  private String nombre;

  @Digits( integer = 5, fraction = 2,  message = "El precio debe ser un número con hasta 2 decimales")
  private double precio;

  @Digits( integer = 5, fraction = 2,  message = "El precio debe ser un número con hasta 2 decimales")
  private double costo;
}
