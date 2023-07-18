package br.com.lojadelivro.console;

import br.com.lojadelivro.basedados.Banco;
import br.com.lojadelivro.entidade.*;
import br.com.lojadelivro.utilidade.LeitoraDados;
import br.com.lojadelivro.negocio.PedidoNegocio;
import br.com.lojadelivro.negocio.ProdutoNegocio;
import br.com.lojadelivro.negocio.ClienteNegocio;

import java.util.Optional;

public class Start {
    private static Cliente clienteLogado = null;
    private static Banco banco = new Banco();
    private static ClienteNegocio clienteNegocio = new ClienteNegocio(banco);
    private static PedidoNegocio pedidoNegocio  = new PedidoNegocio(banco);
    private static ProdutoNegocio produtoNegocio  = new ProdutoNegocio(banco);


    private static void identificarUsuario(String cpf){
        Optional<Cliente> resultado = clienteNegocio.consultar(cpf);

        if (resultado.isPresent()){
            Cliente cliente = resultado.get();
            System.out.println(String.format("Olá %s! Você está logado.", cliente.getNome()));
            clienteLogado = cliente;
        }else{
            System.out.println("Usuário não cadastrado");
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        System.out.println("Bem vindo ao e-Compras");
        String opcao = "";

        while(true){
            if (clienteLogado == null){
                System.out.println("Digite o cpf: ");
                String cpf = "";
                cpf = LeitoraDados.lerDado();
                identificarUsuario(cpf);
            }

            System.out.println("Selecione uma opção: ");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - excluir livro");
            //TODO: consultar Livro(codigo)

            System.out.println("3 - Cadastrar caderno");
            System.out.println("4 - excluir caderno");
            //TODO: consultar Caderno(codigo)

            System.out.println("5 - Fazer pedido");
            System.out.println("6 - excluir pedido");
            //TODO: consultar Pedido(codigo)

            System.out.println("7 - Listar produtos");
            System.out.println("8 - Listar pedidos");

            System.out.println("9 - Consultar produto");

            System.out.println("10 - Deslogar");
            System.out.println("11 - Sair");

            opcao = LeitoraDados.lerDado();

            switch (opcao){
                case "1":
                    Livro livro = LeitoraDados.lerLivro();
                    produtoNegocio.salvar(livro);
                    break;
                case "2":
                    System.out.println("Digite o código do livro: ");
                    String codigoLivro = LeitoraDados.lerDado();
                    produtoNegocio.excluir(codigoLivro);
                    break;
                case "3":
                    //TODO: cadastrar Caderno - Feito
                    Caderno caderno = LeitoraDados.lerCaderno();
                    produtoNegocio.salvar(caderno);
                    break;
                case "4":
                    //TODO: excluir Caderno - Feito
                    System.out.println("Digite o código do caderno: ");
                    String codigoCaderno = LeitoraDados.lerDado();
                    produtoNegocio.excluir(codigoCaderno);
                    break;
                case "5":
                    Pedido pedido = LeitoraDados.lerPedido(banco);
                    Optional<Cupom> cupom = LeitoraDados.lerCupom(banco);

                    if (cupom.isPresent()){
                        pedidoNegocio.salvar(pedido, cupom.get());
                    } else {
                        pedidoNegocio.salvar(pedido);
                    }
                    break;
                case "6":
                    System.out.println("Digite o código do pedido");
                    String codigoPedido = LeitoraDados.lerDado();
                    pedidoNegocio.excluir(codigoPedido);
                    break;
                case "7":
                    produtoNegocio.listarTodos();
                    break;
                case "8":
                    //TODO: Listar todos os Pedidos - Feito
                    pedidoNegocio.listarTodos();
                    break;
                case "9":
                    System.out.println("Digite o código do produto:");
                    String codigo = LeitoraDados.lerDado();
                    produtoNegocio.consultar(codigo);
                    break;
                case "10":
                    System.out.println(String.format("Volte sempre %s!", clienteLogado.getNome()));
                    clienteLogado = null;
                    break;
                case "11":
                    System.out.println("Aplicação encerrada");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;

            }
        }
    }
}
