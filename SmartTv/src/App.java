/*
* @autor axemay
* @since 29/06/23
* @version 1
*/

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
// javadoc -encoding UTF-8 -docenconding ISO-8859-1 -d ../docs src/*.java