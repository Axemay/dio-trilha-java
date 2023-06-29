public class SmartTv {
     boolean ligada = false;
     int canal = 1;
     int volume = 12;

    public void aumentarVolume(){
        this.volume++;
        System.out.println("Aumentando o volume para: "+volume);
    }

    public void diiminuitVolume(){
        this.volume--;
        System.out.println("Diminuindo o volume para: "+volume);
    }

    public boolean ligar(){
        System.out.println("Luz azul");
        return this.ligada = true;

    }

    public boolean desligar(){
        System.out.println("Luz vermelha");
        return this.ligada = false;
    }

    public void aumentarCanal(){
        this.canal++;
    }
    public void diminuirCanal(){
        this.canal--;
    }

    public void mudarCanal(int novoCanal){
        this.canal = novoCanal;
    }


}
