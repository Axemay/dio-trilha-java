package br.com.msnmessager;

import br.com.msnmessager.Apps.FacebookMessenger;
import br.com.msnmessager.Apps.MSNMessenger;
import br.com.msnmessager.Apps.Telegram;
import br.com.msnmessager.Control.ServicoMensagem;

public class Main {
    public static void main(String[] args) {

        ServicoMensagem smi = null;

        String appEscolhido = "msn";

        if(appEscolhido.equals("msn"))
            smi = new MSNMessenger();
        else if(appEscolhido.equals("fbm"))
            smi = new FacebookMessenger();
        else if(appEscolhido.equals("tlg"))
            smi = new Telegram();


        smi.enviarMensagem();
        smi.receberMensagem();

//        MSNMessenger msn = new MSNMessenger();
//        Telegram telegram = new Telegram();
//        FacebookMessenger facebookMessenger = new FacebookMessenger();
//
//        System.out.println("Testando o MSN:");
//        msn.enviarMensagem();
//        msn.receberMensagem();
//        System.out.println("\n");
//
//        System.out.println("Testando o Telegram:");
//        telegram.enviarMensagem();
//        telegram.receberMensagem();
//        System.out.println("\n");
//
//
//        System.out.println("Testando o Facebook Messenger:");
//        facebookMessenger.enviarMensagem();
//        facebookMessenger.receberMensagem();
//        System.out.println("\n");
    }
}
