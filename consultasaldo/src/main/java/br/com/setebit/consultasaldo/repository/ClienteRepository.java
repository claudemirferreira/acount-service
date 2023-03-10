package br.com.setebit.consultasaldo.repository;

import br.com.setebit.consultasaldo.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
