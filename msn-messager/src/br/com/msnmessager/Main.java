package br.com.msnmessager;

public class Main {
    public static void main(String[] args) {
        MSNMessenger msn = new MSNMessenger();
        Telegram telegram = new Telegram();
        FacebookMessenger facebookMessenger = new FacebookMessenger();

        System.out.println("Testando o MSN:");
        msn.enviarMensagem();
        msn.receberMensagem();
        System.out.println("\n");

        System.out.println("Testando o Telegram:");
        telegram.enviarMensagem();
        telegram.receberMensagem();
        System.out.println("\n");


        System.out.println("Testando o Facebook Messenger:");
        facebookMessenger.enviarMensagem();
        facebookMessenger.receberMensagem();
        System.out.println("\n");
    }
}
