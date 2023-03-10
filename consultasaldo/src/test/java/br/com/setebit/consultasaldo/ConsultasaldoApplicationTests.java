package br.com.setebit.consultasaldo;

import br.com.setebit.consultasaldo.model.Cliente;
import br.com.setebit.consultasaldo.repository.ClienteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConsultasaldoApplicationTests {

	@Autowired
	private ClienteRepository clienteRepository;

	@Test
	void save() {
		Cliente cliente = new Cliente();
		cliente.setEmail("claudemir@gmail.com");
		cliente.setNome("Claudemir");
		clienteRepository.save(cliente);
	}

}
