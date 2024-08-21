package main.api.clientecompra.helper;

import main.api.utils.InformacoesCompraDTO;
import main.api.utils.exceptions.ValidacaoCadastroException;

import java.util.Random;
import java.util.Scanner;

public class ClienteCompraHelper {

    public InformacoesCompraDTO cadastrarIngresso() throws ValidacaoCadastroException {
        Scanner scanner = new Scanner(System.in);
        try  {
            System.out.println("***********************");
            Thread.sleep(200);
            System.out.println("Bem-vindo ao CineGracha");
            Thread.sleep(200);
            System.out.println("***********************");

            System.out.println("Como é seu nome?");
            String nomePessoa;
            try {
                nomePessoa = scanner.next();
            } catch (Exception e) {
                throw new ValidacaoCadastroException("Nome incorreto, por favor tente novamente.");
            }

            System.out.println("Como é o seu cpf?");
            String cpfPessoa;
            try {
                cpfPessoa = scanner.next();
            } catch (Exception e) {
                throw new ValidacaoCadastroException("Cpf incorreto, por favor tente novamente.");
            }

            System.out.println("Qual filme deseja assistir?");
            String nomeFilme;
            try {
                nomeFilme = scanner.next();
            } catch (Exception e) {
                throw new ValidacaoCadastroException("Cpf incorreto, por favor tente novamente.");
            }

            Random random = new Random();

            double min = 5.0;
            double max = 10.0;
            double randomDouble = min + (max - min) * random.nextDouble();
            System.out.printf("O valor do ingresso vai ficar: R$ %.2f%n", randomDouble);
            Thread.sleep(200);

            return new InformacoesCompraDTO(nomePessoa, cpfPessoa, nomeFilme, randomDouble);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
