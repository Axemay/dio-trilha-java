import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

/*
* @autor axemay
* @version 1
* @since 29/06/23
 */
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe Scanner
        Scanner leitura = new Scanner(System.in);

        //TODO: Exibir as mensagens para o nosso usuário
        //TODO: Obter pela scanner os valores digitados no terminal

        System.out.println("Por favor, digite o nome do cliente: ");
        String nomeCliente = leitura.nextLine();

        System.out.println("Por favor, digite o número da Agência: ");
        String agencia = leitura.nextLine();

        System.out.println("Por favor, digite o número da conta: ");
        int numero = leitura.nextInt();

        System.out.println("Por favor, digite o saldo: ");
        double saldo = leitura.nextDouble();

        //TODO: Exibir a mensagem conta criada

        System.out.println("Olá, "+ nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia +", conta "+ numero +" e seu saldo "+saldo+" já está disponível para saque.");



    }

}
