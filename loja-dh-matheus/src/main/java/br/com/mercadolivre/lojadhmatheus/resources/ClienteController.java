package br.com.mercadolivre.lojadhmatheus.resources;

import br.com.mercadolivre.lojadhmatheus.dto.ClienteDTO;
import br.com.mercadolivre.lojadhmatheus.dto.PedidoDTO;
import br.com.mercadolivre.lojadhmatheus.mock.MockClientes;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class ClienteController {

    private List<ClienteDTO> clientes = MockClientes.getCliente();

    @GetMapping("/cliente/{id}")
    public ResponseEntity<List<PedidoDTO>> getPedidos(@PathVariable Integer id) {
        ClienteDTO cliente = clientes.stream().filter(c -> c.getId() == 1).findFirst().get();
        return ResponseEntity.ok().body(cliente.getPedidos());
    }
}
