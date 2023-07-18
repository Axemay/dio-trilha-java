package br.com.lojadelivro.entidade;

import java.util.ArrayList;
import java.util.List;
import br.com.lojadelivro.entidade.Produto;

public class Pedido {
    private String codigo;
    private Cliente cliente;
    private List<Produto> produtos;
    private double total;



    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List getProdutos() {
        return produtos;
    }

    public void setProdutos(List produtos) {
        this.produtos = produtos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Pedido(){
        this.produtos = new ArrayList<>();
    }

    private String getProdutosComprados(){
        StringBuilder produtos = new StringBuilder();
        produtos.append("[");
        for (Produto produto : getProdutos()) {
            produtos.append(produto.toString());
            produtos.append("Qtd");
            produtos.append(produto.getQuantidade());
            produtos.append(" ");
        }
        produtos.append("]");
        return produtos.toString();
    }

    public String toString(){
        return "Pedido{" +
                "Codigo='" + codigo + '\'' +
                ", cliente='" + cliente +
                ", produto=" + getProdutosComprados() +
                ", total=" + total +
                "}";
    }

}
