package br.com.lojadelivro.entidade;

public class Caderno extends Produto{
    private Materiais tipo;

    public Materiais getTipo() {
        return tipo;
    }

    public void setTipo(Materiais tipo) {
        this.tipo = tipo;
    }
}
