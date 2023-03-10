package br.com.setebit.consultasaldo.service;

import br.com.setebit.consultasaldo.model.Cliente;
import br.com.setebit.consultasaldo.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteService {

    @Autowired
    ClienteRepository clienteRepository;

    public List<Cliente> findAll(){
        return clienteRepository.findAll();
    }
}
