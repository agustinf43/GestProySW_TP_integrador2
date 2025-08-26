package com.progII.clase01.model;

import com.progII.clase01.enums.TipoUsuario;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Set;


@Entity(name = "Clientes")
@Data
@RequiredArgsConstructor
public class Cliente {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private  int id;

  @NotNull //asegura que el campo no sea nulo
  @NotEmpty
  @Size(min=3, max=50, message = "El nombre debe tener entre 3 y 50 caracteres") //valida la longitud del campo
  private String nombre;

  private String apellido;

  @Email(message = "El email debe ser válido") //valida el formato del email
  private String email;

  @Column(name = "tel")
  private String telefono;

  //para los enums, se recomienda usar
  // @Enumerated para definir cómo se almacenará el enum en la base de datos

  @Enumerated(EnumType.STRING) //almacena el enum como string
  TipoUsuario tipoUsuario;

  @NotEmpty
  @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
  private Set<Direccion> direcciones;

}



