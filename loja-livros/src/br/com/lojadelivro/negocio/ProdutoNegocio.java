package br.com.lojadelivro.negocio;

import br.com.lojadelivro.basedados.Banco;
import br.com.lojadelivro.entidade.Pedido;
import br.com.lojadelivro.entidade.Produto;

import java.util.List;
import java.util.Optional;

public class ProdutoNegocio {
    private Banco bancoDados;


    public ProdutoNegocio(Banco banco) {
        this.bancoDados = banco;
    }

    public void salvar(Produto novoProduto) {
        String codigo = "PR%04d";
        codigo = String.format(codigo, bancoDados.getProdutos().length);
        novoProduto.setCodigo(codigo);

        boolean produtoRepetido = false;
        for (Produto produto : bancoDados.getProdutos()) {
            if (produto.getCodigo().equals(novoProduto.getCodigo())) {
                produtoRepetido = true;
                System.out.println("Produto já cadastrado");
                break;
            }
        }
        if (!produtoRepetido) {
            this.bancoDados.adicionarProduto(novoProduto);
            System.out.println("Produto cadastrado com sucesso");
        }
    }


    public Optional<Produto> consultar(String codigo) {
        for (Produto produto : bancoDados.getProdutos()
        ) {
            if (produto.getCodigo().equalsIgnoreCase(codigo)) {
                return Optional.of(produto);
            }
        }

        return Optional.empty();


    }


    public void listarTodos() {
        if (bancoDados.getProdutos().length == 0) {
            System.out.println("Não existem produtos cadastrados.");
        } else {
            for (Produto produto : bancoDados.getProdutos()
            ) {
                System.out.println(produto.toString());

            }
        }
    }

    public void excluir(String codigo){



        int indice = -1;

        for (int i = 0; i < bancoDados.getProdutos().length; i++){
            Produto produto = bancoDados.getProdutos()[i];

            if(produto.getCodigo().equalsIgnoreCase(codigo)){
                indice = i;
                break;
            }

            if (indice != -1){
                bancoDados.removerProduto(indice);
                System.out.println("produto excluído com sucesso.");
            } else {
                System.out.println("Produto inexistente.");
            }
            }


        }


    }
}
