package br.com.msnmessager.Control;

public abstract class ServicoMensagem {

    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    public abstract void salvarHistoricoMensagem();

    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }


//    public void enviarMensagem() {
//
//        validarConectadoInternet();
//        System.out.println("Enviando mensagem");
//        salvarHistoricoMensagem();
//    }
//    public void receberMensagem() {
//        System.out.println("Recebendo mensagem");
//    }
//
//    private void validarConectadoInternet() {
//        System.out.println("Validando se está conectado a internet");
//    }
//    private void salvarHistoricoMensagem() {
//        System.out.println("Salvando o histórico da mensagem");
//    }
}