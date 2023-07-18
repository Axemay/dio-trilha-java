package br.com.lojadelivro.entidade;

public class Cupom {
    private String codigo;
    private int desconto;

    public Cupom(String codigo, int desconto){
        this.codigo = codigo;
        this.desconto = desconto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getDesconto() {
        return desconto;
    }

    public void setDesconto(int desconto) {
        this.desconto = desconto;
    }
}
