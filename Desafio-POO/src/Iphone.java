public class Iphone {
    public static void main(String[] args) {

    MenuIphone menuIphone = new MenuIphone();
    Telefone telefone = new MenuIphone();


    telefone.ligar();


    System.out.println("\nTestando reprodutor de músicas");
    menuIphone.selecionarMusica();
    menuIphone.tocar();
    menuIphone.pausar();

    System.out.println("\nTestando Telefone");
    menuIphone.ligar();
    menuIphone.iniciarCorreioVoz();
    menuIphone.atender();

    System.out.println("\nTestando Navegador de Internet");
    menuIphone.adicionarNovaAba();
    menuIphone.exibirPagina();
    menuIphone.atualizarPagina();

    }
}