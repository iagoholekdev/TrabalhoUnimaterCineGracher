package main.api.clientecompra.processos.printer;

import main.api.clientecompra.ClienteCompra;

public class CompraClientePrinter {

    public static void imprimirPedido(ClienteCompra clienteCompra) throws Exception {
        System.out.println("Pedido de Compra");
        Thread.sleep(200);
        System.out.println("---------------------");
        Thread.sleep(200);
        System.out.println("ID do Pedido: " + clienteCompra.getId());
        Thread.sleep(200);
        System.out.println("Nome do Cliente: " + clienteCompra.getPessoa().getNome());
        Thread.sleep(200);
        System.out.println("Filme: " + clienteCompra.getFilme().getNome());
        Thread.sleep(200);
        System.out.println("Valor: R$ " + String.format("%.2f", clienteCompra.getValor()));
        Thread.sleep(200);
        System.out.println("Status do ingresso: " + clienteCompra.getIngresso().getSituacao().toString());
        Thread.sleep(200);
        System.out.println("---------------------");
    }


}
