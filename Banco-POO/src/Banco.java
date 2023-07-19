import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(){
        contas = new ArrayList<>();
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public void listarContas(){
        System.out.println("============== CONTAS ABERTAS ==============");
        for (Conta conta: contas

             ) {

            System.out.println(conta.getAgencia() + " / "+ conta.getNumeroConta());

        }
        System.out.println("--------------------------------------------");
    }

    public void adicionarConta(Conta conta){
        this.contas.add(conta);
    }
}
