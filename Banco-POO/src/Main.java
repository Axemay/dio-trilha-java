public class Main {

    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.setNome("ItauderBras");

        //Primeiro cliente
        Cliente cliente1 = new Cliente("John Doe", "45612374831");
        Endereco enderecoCliente1 = new Endereco();
        enderecoCliente1.setLogradouro("Av. João Góes");
        enderecoCliente1.setBairro("Ponte aberta");
        enderecoCliente1.setCidade("Rio Azul");
        enderecoCliente1.setEstado(Estado.RJ);
        enderecoCliente1.setNumero(55);
        enderecoCliente1.setComplemento("Apartamento 105");
        cliente1.setEndereco(enderecoCliente1);

        //Primeiro conta corrente
        ContaCorrente contaCorrente = new ContaCorrente(cliente1);
        contaCorrente.depositar(2000);


        //Primeiro conta poupança vinculada a conta corrente
        ContaPoupanca contaPp = new ContaPoupanca(cliente1);
        contaPp.setContaCorrenteVinculada(contaCorrente);
        contaPp.consultarSaldo();
        contaCorrente.transferir(200, contaPp);
        contaPp.consultarSaldo();

        //Adicionando contas ao banco
        banco.adicionarConta(contaCorrente);
        banco.adicionarConta(contaPp);
        banco.listarContas();

        //Imprimindo cadastros
        contaCorrente.exibirCadastroConta();
        contaPp.exibirCadastroConta();
    }
}
