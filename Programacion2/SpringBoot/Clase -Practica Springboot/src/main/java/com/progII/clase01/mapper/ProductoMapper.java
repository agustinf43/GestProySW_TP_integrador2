package com.progII.clase01.mapper;

import com.progII.clase01.dto.ProductoDTO;
import com.progII.clase01.dto.ProductoEnVentaDTO;
import com.progII.clase01.model.Producto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ProductoMapper {

  ProductoDTO toProductoDTO(Producto producto);
  Producto toProducto(ProductoDTO productoDTO);

  ProductoEnVentaDTO toProductoEnVentaDTO(Producto producto);
  Producto toProducto(ProductoEnVentaDTO productoEnVentaDTO);
}
