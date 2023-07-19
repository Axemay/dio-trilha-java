public class Cliente {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Cliente(String nome, String cpf){
        this.nome = nome;
        this.cpf =cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void exibirCadastroCliente(){
        System.out.println("============= CADASTRO DE CLIENTE =============");
        System.out.println("Nome: "+ this.getNome());
        System.out.println("CPF: "+ this.getCpf());
        System.out.println("------------------- ENDEREÇO ------------------");
        System.out.println("Logradouro: "+ this.endereco.getLogradouro());
        System.out.println("Número: "+ this.endereco.getNumero());
        System.out.println("Complemento: "+ this.endereco.getComplemento());
        System.out.println("Bairro: "+ this.endereco.getBairro());
        System.out.println("Estado: "+ this.endereco.getEstado());
        System.out.println("Cidade: "+ this.endereco.getCidade());
    }
}
