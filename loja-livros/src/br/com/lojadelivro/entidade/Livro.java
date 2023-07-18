package br.com.lojadelivro.entidade;

public class Livro extends Produto{
    private String nome;
    private Genero genero;

    public Livro(){}

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public double calcularFrete() {return (getPreco() * getQuantidade() * (1 + genero.getFator()));}

    public String toString(){
        return "Livro{"+
                "nome='"+ nome + '\''+
                ", genero" + genero + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", preço='" + getPreco() + '\'' +
                '}';
    }

}
