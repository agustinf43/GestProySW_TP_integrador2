package com.progII.clase01.service.impl;

import com.progII.clase01.dto.ProductoDTO;
import com.progII.clase01.dto.ProductoEnVentaDTO;
import com.progII.clase01.mapper.ProductoMapper;
import com.progII.clase01.model.Producto;
import com.progII.clase01.repository.ProductoRepository;
import com.progII.clase01.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServiceImpl implements ProductoService {
  @Autowired
  private ProductoRepository productoRepository;

  @Autowired
  private ProductoMapper productoMapper;


  /**
   * @return
   */
  @Override
  public List<ProductoDTO> obtenerLista() {

    List<Producto> lista= productoRepository.findAll();

    return  lista.stream().map(productoMapper::toProductoDTO).toList();
  }

  @Override
  public ProductoDTO encontrarPorId(Integer id) {
    Producto producto= productoRepository.findById(id).orElse(null);
    return  productoMapper.toProductoDTO(producto);
  }

  @Override
  public ProductoDTO guardar(ProductoDTO productoDTO) {
    Producto producto = productoMapper.toProducto(productoDTO);
    Producto savedProducto = productoRepository.save(producto);
    return productoMapper.toProductoDTO(savedProducto);
  }

  @Override
  public ProductoDTO actualizar(ProductoDTO productoDTO) {
    Producto producto = productoMapper.toProducto(productoDTO);
    Producto savedProducto = productoRepository.save(producto);
    return productoMapper.toProductoDTO(savedProducto);
  }




  @Override
  public void BorrarPorId(Integer id) {
    productoRepository.deleteById(id);
  }

   @Override
  public List<ProductoEnVentaDTO> obtenerProductosEnVenta() {

    List<Producto> productos = productoRepository.findAll();
    List<ProductoEnVentaDTO> productosEnVenta
        = productos.stream()
        .map(productoMapper::toProductoEnVentaDTO)
        .toList();

    return productosEnVenta;
  }
}










