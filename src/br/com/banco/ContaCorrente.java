package br.com.banco;

public class ContaCorrente extends Conta {

    public ContaCorrente(int numero, Cliente cliente) {
        super(numero, cliente);
    }

    @Override
    public void exibirDados() {
        System.out.println("=== Conta Corrente ===");
        System.out.println("Cliente: " + getCliente().getNome());
        System.out.println("CPF: " + getCliente().getCpf());
        System.out.println("Número da Conta: " + getNumero());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("======================\n");
    }
}
