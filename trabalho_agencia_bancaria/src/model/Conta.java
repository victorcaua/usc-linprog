package model;

import utils.Utils;

public class Conta {

    private static int accountCounter = 1;

    private int numeroConta;
    private Pessoa pessoa;
    private Double saldo = 0.0;

    //METODO CONSTRUTOR
    public Conta(Pessoa pessoa) {
        this.numeroConta = Conta.accountCounter;
        this.pessoa = pessoa;
        this.updateSaldo();
        Conta.accountCounter += 1;
    }

    //GETTERS
    public int getNumeroConta() {
        return numeroConta;
    }

    public Pessoa getClient() {
        return pessoa;
    }

    public Double getSaldo() {
        return saldo;
    }

    //SETTERS
    public void setClient(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }


    //METODOS
    private void updateSaldo() {
        this.saldo = this.getSaldo();
    }

    public String toString() {
        return "\nConta Bancária: " + this.getNumeroConta() +
                "\nCliente: " + this.pessoa.getName() +
                "\nCPF: " + this.pessoa.getCpf() +
                "\nEmail: " + this.pessoa.getEmail() +
                "\nSaldo: " + Utils.doubleToString(this.getSaldo());
    }

    public void depositar(Double valor) {
        if(valor > 0) {
            setSaldo(getSaldo() + valor);
            System.out.println("Seu depósito foi realizado com sucesso!");
        }
        else {
            System.out.println("Não foi possível realizar o saque");
        }
    }

    public void sacar(Double valor) {
        if(valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque realizado com sucesso!");
        }
        else {
            System.out.println("Não foi possível realizar o saque!");
        }
    }

//    public void transferencia(Conta ContaParaDeposito, Double Valor) {
//        if(Valor > 0 && this.getSaldo() >= Valor) {
//            setSaldo(getSaldo() - Valor);
//            ContaParaDeposito.saldo = ContaParaDeposito.getSaldo() + Valor;
//            System.out.println("Transferência realizada com sucesso!");
//        }
//        else {
//            System.out.println("Não foi possível realizar a tranferência");
//        }
//    }

    public void ted(Conta contaParaDeposito, Double valor) {
        if(valor > 0 && this.getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
            System.out.println("Ted realizada com sucesso!");
        }
        else {
            System.out.println("Não foi possível realizar o Ted (Saldo insuficiente)");
        }
    }
}

