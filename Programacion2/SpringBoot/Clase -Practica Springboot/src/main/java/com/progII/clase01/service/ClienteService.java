package com.progII.clase01.service;

import com.progII.clase01.dto.ClienteDTO;

import java.util.List;

public interface ClienteService {
  public List<ClienteDTO> getAllClientes();
  public ClienteDTO getClienteById(Integer id);
  public ClienteDTO saveCliente(ClienteDTO clienteDTO);
  public void deleteClienteById(Integer id);
}
