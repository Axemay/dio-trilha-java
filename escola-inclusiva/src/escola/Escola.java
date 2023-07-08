package escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno("Felipe", 18, "Masculino");
//        Aluno felipe = new Aluno();
//        felipe.setNome("felipe");
//        felipe.setIdade(18);
//        felipe.setGenero("Masculino");


        Aluno maria = new Aluno("Maria", 20, "Feminino");
//        Aluno maria = new Aluno();
//        maria.setNome("Maria");
//        maria.setIdade(20);
//        maria.setGenero("Feminino");

        Aluno taylor = new Aluno("Taylor", 22, "Outro");
//        Aluno taylor = new Aluno();
//        taylor.setNome("Taylor");
//        taylor.setIdade(19);
//        taylor.setGenero("Outro");




        System.out.println(Aluno.verificaGenero(felipe) + felipe.getNome() + " tem " + felipe.getIdade() + " anos ");
        System.out.println(Aluno.verificaGenero(maria) + maria.getNome() + " tem " + maria.getIdade() + " anos ");
        System.out.println(Aluno.verificaGenero(taylor) + taylor.getNome() + " tem " + taylor.getIdade() + " anos ");
    }
}