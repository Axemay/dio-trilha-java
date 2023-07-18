package br.com.lojadelivro.utilidade;

import br.com.lojadelivro.basedados.Banco;
import br.com.lojadelivro.entidade.*;
import br.com.lojadelivro.negocio.ProdutoNegocio;

import java.util.Optional;
import java.util.Scanner;

public final class LeitoraDados {
    private static Scanner scanner;
    static{
        scanner = new Scanner(System.in);
    }



    public static String lerDado(){
        String texto = scanner.nextLine();
        return texto;
    }

    public static Livro lerLivro(){
        System.out.println("Cadastrando Livro...");
        Livro livro = new Livro();

        System.out.println("Digite o nome do Livro");
        String nome = lerDado();
        livro.setNome(nome);

        System.out.println("Digite o gênero: DRAMA, SUSPENSE, ROMANCE");
        String genero = lerDado();
        livro.setGenero(Genero.valueOf(genero.toLowerCase()));

        System.out.println("Digite o preço(padrão 0.0");
        String preco = lerDado();
        livro.setPreco(Double.parseDouble(preco));
        return livro;
    }

    //TODO: Método para ler o caderno
    public static Caderno lerCaderno(){
        System.out.println("Cadastrando Caderno...");
        Caderno caderno = new Caderno();

        System.out.println("Digite o tipo de caderno.");
        String tipo = lerDado();
        caderno.setTipo(Materiais.valueOf(tipo));

        System.out.println("Digite o preço(padrão 0.0");
        String precoCaderno = lerDado();
        caderno.setPreco(Double.parseDouble(precoCaderno));

        return caderno;

    }


    public static Pedido lerPedido(Banco banco){
        ProdutoNegocio produtoNegocio = new ProdutoNegocio(banco);
        System.out.println("Cadastrando pedido...");
        Pedido pedido = new Pedido();

        String opcao = "s";

        do {
            System.out.println("Digite o código do produto(livro/caderno)");
            String codigo = lerDado();

            Optional<Produto> resultado = produtoNegocio.consultar(codigo);
            if (resultado.isPresent()){
                Produto produto = resultado.get();

                System.out.println("Digite a quantidade");
                String quantidade = lerDado();
                produto.setQuantidade().add(produto);
            } else{
                System.out.println("Produto inexistente. Escolha um produto válido.");
            }
            System.out.println("Deseja selecionar mais um produto? s/n");
            opcao = lerDado();
        } while ("s".equals(opcao));
        return pedido;
    }

    public static Optional<Cupom> lerCupom(Banco banco){
        System.out.println("Caso queira utilizar algum cupom escolha entre: CUPOM2, CUPOM5, CUPOM7.");
        String desconto = lerDado();

        for (Cupom cupom: banco.getCupons()){
            if (cupom.getCodigo().equalsIgnoreCase(desconto)){
                return Optional.of(cupom);
            }
        }
        return Optional.empty();
    }

}
