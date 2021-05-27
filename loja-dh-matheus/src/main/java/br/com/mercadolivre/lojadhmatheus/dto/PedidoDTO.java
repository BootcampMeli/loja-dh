package br.com.mercadolivre.lojadhmatheus.dto;

import java.util.ArrayList;
import java.util.List;

public class PedidoDTO {

    private Integer id;
    private Double valorTotal;
    private List<ProdutoDTO> produtos = new ArrayList<>();

    public PedidoDTO(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getValorTotal() {
        return this.produtos.stream().mapToDouble(ProdutoDTO::getValorTotal).sum();
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public List<ProdutoDTO> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<ProdutoDTO> produtos) {
        this.produtos = produtos;
    }
}
