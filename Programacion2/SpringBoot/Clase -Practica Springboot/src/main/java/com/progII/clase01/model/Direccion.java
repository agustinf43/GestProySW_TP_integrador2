package com.progII.clase01.model;

import com.progII.clase01.enums.TipoDireccion;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Direccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String calle;
    private String numero;
    private String entreCalles;
    private String barrio;
    private String ciudad;
    @Enumerated(EnumType.STRING)
    private TipoDireccion tipoDireccion;

    @ManyToOne
    @JoinColumn(name = "cliente_id")
    private Cliente cliente;
}
