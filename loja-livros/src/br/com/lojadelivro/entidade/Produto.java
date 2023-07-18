package br.com.lojadelivro.entidade;

public class Produto {
    private String codigo;
    private double preco;
    private int quantidade;

    public String getCodigo() {
        return codigo;
    }

    public Produto(){}

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }


    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //TODO: Método de cálculo de frete
    public abstract double calcularFrete();
}

