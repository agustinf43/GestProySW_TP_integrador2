package com.progII.clase01.service.impl;

import com.progII.clase01.dto.ClienteDTO;
import com.progII.clase01.mapper.ClienteMapper;
import com.progII.clase01.model.Cliente;
import com.progII.clase01.repository.ClienteRepository;
import com.progII.clase01.service.ClienteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class ClienteServiceImpl  implements ClienteService {


  private  final ClienteRepository clienteRepository;
  private final ClienteMapper clienteMapper;

  @Override
  public List<ClienteDTO> getAllClientes() {
      List<Cliente> lista = clienteRepository.findAll();
      return lista.stream().map(clienteMapper::toClienteDTO).collect(Collectors.toList());
  }
  @Override
  public ClienteDTO getClienteById(Integer id) {
    Cliente cliente = clienteRepository.findById(id).orElse(null);
    return  clienteMapper.toClienteDTO(cliente);
  }
  @Override
  public ClienteDTO saveCliente(ClienteDTO clienteDTO) {
    Cliente cliente = clienteMapper.toCliente(clienteDTO);
    Cliente savedCliente = clienteRepository.save(cliente);
    return clienteMapper.toClienteDTO(savedCliente);
  }
  @Override
  public void deleteClienteById(Integer id) {
      clienteRepository.deleteById(id);
  }
}
