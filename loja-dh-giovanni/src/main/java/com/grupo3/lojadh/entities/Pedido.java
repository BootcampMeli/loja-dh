package com.grupo3.lojadh.entities;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private Integer id;
    private List<Produto> listaDeProdutos;
    private Double total;

    public Pedido(Integer id) {
        this.id = id;
        this.listaDeProdutos = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Produto> getListaDeProdutos() {
        return listaDeProdutos;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double aDouble){
        this.total = calcularTotal();
    }

    public Double calcularTotal(){
        return listaDeProdutos.stream().mapToDouble(x -> x.calcularSubTotal()).sum();
    }
}
