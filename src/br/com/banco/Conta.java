package br.com.banco;

public abstract class Conta {
    private int numero;
    protected double saldo; // protegido para herança
    private Cliente cliente;

    public Conta(int numero, Cliente cliente) {
        this.numero = numero;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferir(double valor, Conta destino) {
        if (valor <= saldo) {
            this.sacar(valor);
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente para transferência!");
        }
    }

    // método abstrato: polimorfismo
    public abstract void exibirDados();
}
