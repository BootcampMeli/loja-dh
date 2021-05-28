package com.grupo3.lojadh.resources;

import com.grupo3.lojadh.entities.Cliente;
import com.grupo3.lojadh.entities.Pedido;
import com.grupo3.lojadh.entities.Produto;
import com.grupo3.lojadh.mock.Generate;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    List<Cliente> clientes = Generate.createMock();

    @GetMapping("/{id}")
    public ResponseEntity<List<Pedido>> getAllPedidosDoCliente(@PathVariable Integer id){
        Cliente cli = clientes.stream().filter(x -> x.getId() == id).findFirst().get();
        return ResponseEntity.ok().body(cli.getListaDePedidos());
    }
}
