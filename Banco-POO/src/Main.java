public class Main {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("John Doe", "45612374831");
        Cliente cliente2 = new Cliente("Kara Dane", "458754234831");
        Cliente cliente3 = new Cliente("Maria Silva", "458871235831");
        Conta conta = new Conta();
        System.out.println(conta.getAgencia());
        System.out.println(conta.getNumeroConta());

        conta.depositar(2000);


        Conta conta2 = new ContaCorrente();
        conta2.setCliente(cliente2);

        System.out.println(conta2.getNumeroConta());

        ContaCorrente conta3 = new ContaCorrente();
        conta3.setCliente(cliente3);
        System.out.println(conta3.getNumeroConta());


        Conta contaPp = new ContaPoupanca();
        contaPp.setCliente(cliente1);
        contaPp.consultarSaldo();
        conta.transferir(200, contaPp);
        contaPp.consultarSaldo();
    }
}
