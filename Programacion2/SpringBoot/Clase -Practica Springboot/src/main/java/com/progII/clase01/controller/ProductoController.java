package com.progII.clase01.controller;


import com.progII.clase01.dto.ProductoDTO;
import com.progII.clase01.dto.ProductoEnVentaDTO;
import com.progII.clase01.model.Producto;
import com.progII.clase01.repository.ProductoRepository;
import com.progII.clase01.service.ProductoService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ProductoController {

  @Autowired
  private ProductoService productoService;

  @GetMapping
   ResponseEntity<List<ProductoDTO>> getAllProductos() {
    ResponseEntity responseEntity
          = ResponseEntity.ok(productoService.obtenerLista());
    return responseEntity;
  }
  @GetMapping("/productos-en-venta")
  ResponseEntity<List<ProductoEnVentaDTO>> getAllProductosEnVenta() {
    ResponseEntity responseEntity
        = ResponseEntity.ok(productoService.obtenerProductosEnVenta());
    return responseEntity;
  }


  @PostMapping
  ResponseEntity<ProductoDTO> createProducto(@RequestBody @Valid ProductoDTO producto) {
    ResponseEntity responseEntity=
        ResponseEntity.status(HttpStatus.CREATED).body(productoService.guardar(producto));
    return responseEntity;
  }

  @PutMapping
  ResponseEntity<ProductoDTO>  updateProducto(@RequestBody @Valid ProductoDTO producto) {
    //return productoService.actualizar(producto);
    return new ResponseEntity<>(productoService.actualizar(producto), HttpStatus.OK);
  }

  @DeleteMapping
  ResponseEntity<String> deleteProducto(@RequestParam int id) {
    //productoService.BorrarPorId(id);
    return new  ResponseEntity<>( "borrado con exito",HttpStatus.NO_CONTENT);

  }

}
