package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
//        analisarCandidato(3000);
//        analisarCandidato(1900);
//        analisarCandidato(2000);
        selecionarCandidatosPorSalario();
    }

        static void imprimirSelecionados(){
        
        }
    static void selecionarCandidatosPorSalario() {
        String[] candidatos = {"Miguel", "Arthur", "Gael", "Théo", "Heitor", "Ravi", "Davi", "Bernardo", "Noah", "Gabriel", "Helena", "Alice", "Laura", "Maria Alice", "Sophia", "Manuela", "Maitê", "Liz", "Cecília", "Isabella"};
     int candidatosSelecionados = 0;
     int candidatoAtual = 0;
     double salarioBase = 2000.0;

     while(candidatosSelecionados < 5 && candidatosSelecionados < candidatos.length){
         String candidato = candidatos[candidatoAtual];
         double salarioPretendido = valorPretendido();
         System.out.println("O candidato " + candidato + " solicitou este valor de salário: R$"+ salarioPretendido);

         if(salarioBase >= salarioPretendido){
             System.out.println("O candidato " + candidato + " foi selecionado para a vaga.");
             candidatosSelecionados++;
         }
         candidatoAtual++;
     }

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
