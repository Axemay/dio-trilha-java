package br.com.lojadelivro.negocio;

import br.com.lojadelivro.basedados.Banco;
import br.com.lojadelivro.entidade.Cupom;
import br.com.lojadelivro.entidade.Pedido;
import br.com.lojadelivro.entidade.Produto;

import java.time.LocalDate;
import java.util.List;

public class PedidoNegocio {
    private Banco bancoDados;

    public PedidoNegocio(Banco banco){ this.bancoDados = banco;}

    private double calcularTotal(List<Produto> produtos, Cupom cupom){
        double total = 0.0;
        for (Produto produto: produtos){
            total += produto.calcularFrete();
        }
        if (cupom != null){
            return total * (1 - cupom.getDesconto());
        }else {

            return total;
        }
    }

    public void salvar(Pedido novoPedido){
        salvar(novoPedido, null);
    }

    public void salvar(Pedido novoPedido, Cupom cupom){

        // Definição do padrão do código
        String codigo = "PE%4d%2d%04d";
        LocalDate hoje = LocalDate.now();
        codigo = String.format(codigo, hoje.getYear(), hoje.getMonthValue(), bancoDados.getPedidos().lenght);

        // Setar código no pedido
        novoPedido.setCodigo(codigo);

        // setar cliente no pedido
        novoPedido.setCliente(bancoDados.getCliente());

        // calcular e set total
        novoPedido.setTotal(calcularTotal(novoPedido.getProdutos(), cupom));

        // adicionar no banco
        bancoDados.adicionarPedido(novoPedido);

        //mensagem
        System.out.println("Pedido realizado com sucesso!");



    }

    public void excluir(String codigo){
        int pedidoExclusao = -1;
        for (int i = 0; i < bancoDados.getPedido().length; i++){
            Pedido pedido = bancoDados.getPedido()[i];
            if (pedido.getCodigo().equals(codigo)){
                pedidoExclusao = i;
                break;
            }
        }
        if(pedidoExclusao != -1){
            bancoDados.removerPedido(pedidoExclusao);
            System.out.println("Pedido excluído com sucesso.");
        } else {
            System.out.println("pedido inexistente.");
        }
    }
 //TODO: Método de listar todos os pedidos

    public void listarTodos(){
        if (bancoDados.getProdutos().length == 0){
            System.out.println("Não existem produtos cadastrados.");
        } else{
            for (Produto produto: bancoDados.getProdutos()
                 ) {
                System.out.println(produto.toString());

            }
        }

    }

}
