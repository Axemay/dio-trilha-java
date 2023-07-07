package escola;


public class Aluno {
    private String nome;
    private int idade;

    private String genero;

    public Aluno(String nome, int idade, String genero) {
        this.nome = nome;
        this.idade = idade;
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public static String verificaGenero(Aluno aluno){
        String genero = aluno.getGenero();
        String mensagem;

        if(genero.equalsIgnoreCase("Masculino")){
            mensagem = "O aluno ";
        } else if (genero.equalsIgnoreCase("Feminino")) {
            mensagem = "A aluna ";

        } else {
            mensagem = "ile alune ";
        }
        return mensagem;
    }
}



