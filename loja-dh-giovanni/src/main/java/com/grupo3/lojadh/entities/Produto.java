package com.grupo3.lojadh.entities;

public class Produto {
    private Integer id;
    private String descrição;
    private String cor;
    private Integer quantidade;
    private Double preco;

    public Produto(Integer id, String descrição, String cor, Integer quantidade, Double preco) {
        this.id = id;
        this.descrição = descrição;
        this.cor = cor;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Double calcularSubTotal(){
        return quantidade * preco;
    }
}
