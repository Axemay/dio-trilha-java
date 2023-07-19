public class Conta implements IConta {

    protected static final String AGENCIA_PADRAO = "0001";
    protected int numeroConta;
    protected String agencia;
    protected Cliente cliente;
    protected double saldo;
    protected TipoConta tipoConta;

    private static int SEQUENCIAL = 1;

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Conta(){
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numeroConta = SEQUENCIAL++;

    }


    public int getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }


    @Override
    public void sacar(double valor) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente");
        }

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso!");
        System.out.println("Novo saldo: "+ this.saldo);
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual: "+getSaldo());
    }
}
