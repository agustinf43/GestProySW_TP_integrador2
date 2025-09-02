package com.progII.clase01.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

@Entity(name = "Productos")
@Data

@RequiredArgsConstructor
public class Producto {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;

  @NotNull
  @NotEmpty
  @Size(min=3, max=50, message = "El nombre debe tener entre 3 y 50 caracteres") //valida la longitud del campo
  private String nombre;

  @Digits( integer = 5, fraction = 2,  message = "El precio debe ser un número con hasta 2 decimales")
  private  double precio;

  @Transient //no se guarda en la base de datos
  private  double costo;
}
