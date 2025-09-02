package com.progII.clase01.service;

import com.progII.clase01.dto.ProductoDTO;
import com.progII.clase01.dto.ProductoEnVentaDTO;
import com.progII.clase01.model.Producto;

import java.util.List;

public interface ProductoService {
     List<ProductoDTO> obtenerLista();
     ProductoDTO encontrarPorId(Integer id);
     ProductoDTO guardar(ProductoDTO productoDTO);
     ProductoDTO actualizar(ProductoDTO productoDTO);
     void BorrarPorId(Integer id);
     List<ProductoEnVentaDTO> obtenerProductosEnVenta();}