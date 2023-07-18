public class MenuIphone implements NavegadorInternet, ReprodutorMusical, Telefone{


    @Override
    public void adicionarNovaAba() {
        System.out.println("Abrindo nova aba");
    }

    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando a página");
    }


    @Override
    public void tocar() {
        System.out.println("Tocando música");

    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
    }

    @Override
    public void ligar() {
        System.out.println("Ligando para contato");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo ligação");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando Correio de Voz");
    }
}
