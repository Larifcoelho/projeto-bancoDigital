package br.com.banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Banco banco = new Banco("Banco Digital");

        System.out.print("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o CPF do cliente: ");
        String cpf = scanner.nextLine();

        Cliente cliente = new Cliente(nome, cpf);

        // Criando contas
        Conta cc = new ContaCorrente(1, cliente);
        Conta cp = new ContaPoupanca(2, cliente);

        banco.adicionarConta(cc);
        banco.adicionarConta(cp);

        // Operações
        cc.depositar(1000);
        cp.depositar(500);

        cc.sacar(200);
        cc.transferir(300, cp);

        // Exibir contas
        banco.listarContas();

        scanner.close();
    }
}
