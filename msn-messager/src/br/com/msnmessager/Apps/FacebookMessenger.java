package br.com.msnmessager.Apps;

import br.com.msnmessager.Control.ServicoMensagem;

public class FacebookMessenger extends ServicoMensagem {

    @Override
    protected void validarConectadoInternet() {
        super.validarConectadoInternet();
    }

    @Override
    public void salvarHistoricoMensagem() {

    }

    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Facebook Messenger");
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
    }

}
