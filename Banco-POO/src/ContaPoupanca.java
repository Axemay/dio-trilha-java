public class ContaPoupanca extends Conta{
    private ContaCorrente contaCorrenteVinculada;
    public ContaPoupanca(Cliente cliente){
        super(cliente);
        tipoConta = TipoConta.CP;
    }

    public String getContaCorrenteVinculada() {

            return contaCorrenteVinculada.getAgencia() + " / " +  contaCorrenteVinculada.getNumeroConta();
    }

    public void setContaCorrenteVinculada(ContaCorrente contaCorrenteVinculada) {
        this.contaCorrenteVinculada = contaCorrenteVinculada;
    }

    public void exibirCadastroConta(){
        System.out.println("============= DADOS DA CONTA =============");
        System.out.println("Agência: "+ this.getAgencia());
        System.out.println("Número: "+ this.getNumeroConta());
        System.out.println("Tipo de conta: "+ this.getTipoConta().getTipo());
        System.out.println("Saldo atual: "+ this.getSaldo());

        if(this.contaCorrenteVinculada != null) {
            System.out.println("Conta corrente vinculada: " + this.getContaCorrenteVinculada());
        }
        this.cliente.exibirCadastroCliente();
    }
}
