package com.progII.clase01.dto;


import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProductoEnVentaDTO {

    private int id;
    private String nombre;
    private double precio;

}
