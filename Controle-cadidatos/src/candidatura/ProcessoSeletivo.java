package candidatura;

import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
//        analisarCandidato(3000);
//        analisarCandidato(1900);
//        analisarCandidato(2000);

        ArrayList<String> candidatosSelecionados = selecionarCandidatosPorSalario();
        for (String candidato: candidatosSelecionados
             ) {
            contatarCandidato(candidato);
        }

        }

    static void contatarCandidato(String candidatoSelecionado) {
        int tentativas = 1;
        String candidato = candidatoSelecionado;
        boolean continuarTentando = true;
        boolean atendeu = false;
        do {
           atendeu = atender();
           continuarTentando = !atendeu;
           if(continuarTentando){
               tentativas++;
           } else{
               System.out.println("Contato realizado com sucesso com "+ candidato);
           }
        } while(continuarTentando && tentativas < 3);
    }
    static boolean atender(){
        return new Random().nextInt(3)==1;
    }

        static void imprimirCandidatosSelecionados(ArrayList<String> lista) {
            System.out.println("*************************************************");
            System.out.println("Lista de candidatos selecionados");
            System.out.println("*************************************************");
            for (String candidato:
                 lista) {

                System.out.println("O candidato "+ candidato +" foi selecionado.");
            }
    }
    static ArrayList<String> selecionarCandidatosPorSalario() {
        String[] candidatos = {"Miguel", "Arthur", "Gael", "Théo", "Heitor", "Ravi", "Davi", "Bernardo", "Noah", "Gabriel", "Helena", "Alice", "Laura", "Maria Alice", "Sophia", "Manuela", "Maitê", "Liz", "Cecília", "Isabella"};
     int candidatosSelecionados = 0;
     int candidatoAtual = 0;
     double salarioBase = 2000.0;
        ArrayList<String> listaCandidatosSelecionados = new ArrayList<>();

     while(candidatosSelecionados < 5 && candidatosSelecionados < candidatos.length){
         String candidato = candidatos[candidatoAtual];
         double salarioPretendido = valorPretendido();
         System.out.println("O candidato " + candidato + " solicitou este valor de salário: R$"+ salarioPretendido);

         if(salarioBase >= salarioPretendido){
             System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
             listaCandidatosSelecionados.add(candidato);
             candidatosSelecionados++;
         }
         candidatoAtual++;
     }
        imprimirCandidatosSelecionados(listaCandidatosSelecionados);
        return listaCandidatosSelecionados;
        }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contraproposta");
        } else {
            System.out.println("Aguardar o resultado de outros candidatos");
        }
    }
}
