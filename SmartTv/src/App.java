public class App {
    public static void main(String[] args) throws Exception {
        SmartTv tv = new SmartTv();

        tv.ligar();
        System.out.println("canal atual: "+ tv.canal);
        tv.mudarCanal(19);
        System.out.println("canal atual: "+ tv.canal);

        tv.desligar();
    }
}
