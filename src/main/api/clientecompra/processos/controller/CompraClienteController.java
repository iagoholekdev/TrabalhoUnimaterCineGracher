package main.api.clientecompra.processos.controller;

import main.api.clientecompra.ClienteCompra;
import main.api.clientecompra.helper.ClienteCompraHelper;
import main.api.clientecompra.processos.printer.CompraClientePrinter;
import main.api.utils.InformacoesCompraDTO;
import main.api.utils.exceptions.ValidacaoCadastroException;

public class CompraClienteController {

    public InformacoesCompraDTO cadastrarIngresso() throws ValidacaoCadastroException  {
        return new ClienteCompraHelper().cadastrarPedido();
    }

    public void imprimirPedido(ClienteCompra clienteCompra) throws Exception {
        CompraClientePrinter.imprimirPedido(clienteCompra);
    }

}
