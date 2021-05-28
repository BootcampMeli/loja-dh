package com.grupo3.lojadh.mock;

import com.grupo3.lojadh.entities.Cliente;
import com.grupo3.lojadh.entities.Pedido;
import com.grupo3.lojadh.entities.Produto;

import java.util.Arrays;
import java.util.List;

public class Generate {

    public static List<Cliente> createMock() {
        Produto p1 = new Produto(1, "Cabo USB tipo C", "Preto", 2, 19.90);
        Produto p2 = new Produto(2, "Mouse BT", "Preto", 1, 69.90);

        Pedido ped1 = new Pedido(1);
        ped1.getListaDeProdutos().add(p1);
        ped1.getListaDeProdutos().add(p2);
        ped1.setTotal(ped1.calcularTotal());

        Cliente c1 = new Cliente(1, "John Doe", "120.170.222-29", "john@example.com", "(11) 95555-4444");
        c1.getListaDePedidos().add(ped1);

        return Arrays.asList(c1);
    }
}
