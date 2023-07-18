package br.com.lojadelivro.entidade;

public class Cliente {
    private String nome;
    private String cpf;


    public Cliente(){
        this.nome = "Fulano";
        this.cpf = "12345678910";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
