package br.com.mercadolivre.lojadhmatheus.mock;

import br.com.mercadolivre.lojadhmatheus.dto.ClienteDTO;
import br.com.mercadolivre.lojadhmatheus.dto.PedidoDTO;
import br.com.mercadolivre.lojadhmatheus.dto.ProdutoDTO;

import java.util.Arrays;
import java.util.List;

public class MockClientes {

    public static List<ClienteDTO> getCliente(){
        ClienteDTO cliente = new ClienteDTO(1, "Matheus", "11111111", "matheus.agomes@mercadolivre.com", 11111111);

        PedidoDTO ped1 = new PedidoDTO(1);
        PedidoDTO ped2 = new PedidoDTO(2);

        ProdutoDTO prod1 = new ProdutoDTO(1, "Computador", "Preto", 2, 2000.00);
        ProdutoDTO prod2 = new ProdutoDTO(2, "Celular", "Azul", 1, 500.00);
        ProdutoDTO prod3 = new ProdutoDTO(3, "Monitor", "Cinza", 3, 699.00);
        ProdutoDTO prod4 = new ProdutoDTO(4, "Mouse", "Preto", 1, 89.00);

        ped1.setProdutos(Arrays.asList(prod1, prod3));
        ped2.setProdutos(Arrays.asList(prod2, prod4));

        cliente.setPedidos(Arrays.asList(ped1, ped2));

        return Arrays.asList(cliente);
    }
}
