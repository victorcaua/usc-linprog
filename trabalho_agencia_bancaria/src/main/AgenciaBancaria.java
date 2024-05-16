package main;

import java.util.ArrayList;
import java.util.Scanner;

import model.ContaPoupanca;
import model.Pessoa;
import model.Conta;


public class AgenciaBancaria {

    static Scanner input = new Scanner(System.in);
    static ArrayList<Conta> contasBancarias;

    public static void main(String[] args) {
        contasBancarias = new ArrayList<Conta>();
        operacoes();
    }

    public static void operacoes() {

        System.out.println("------------------------------------------------------");
        System.out.println("-------------Bem vindos a nossa Agência---------------");
        System.out.println("------------------------------------------------------");
        System.out.println("***** Selecione uma operação que deseja realizar *****");
        System.out.println("------------------------------------------------------");
        System.out.println("|   Opção 1 - Criar conta   |");
        System.out.println("|   Opção 2 - Depositar     |");
        System.out.println("|   Opção 3 - Sacar         |");
        System.out.println("|   Opção 4 - Transferir    |");
        System.out.println("|   Opção 5 - Listar        |");
        System.out.println("|   Opção 6 - Sair          |");

        int operacao = input.nextInt();;

        switch (operacao) {
            case 1:
                criarConta();
                break;

            case 2:
                depositar();
                break;

            case 3:
                sacar();
                break;

            case 4:
                transferir();
                break;

            case 5:
                listarContas();
                break;

            case 6:
                System.out.println("Flw é nóis!");
                System.exit(0); // para o sistema

            default:
                System.out.println("Opção inválida!");
                operacoes();
                break;
        }
    }

    public static void criarConta() {
        System.out.println("-------------------------");
        System.out.println("***** CRIANDO CONTA *****");
        System.out.println("-------------------------");

        System.out.println("Digite seu nome: ");
        String nome = input.next();
        input.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf = input.next();
        input.nextLine();

        System.out.println("Digite seu e-mail: ");
        String email = input.next();
        input.nextLine();

        Pessoa cliente = new Pessoa(nome, cpf, email);

        System.out.println("***** TIPO DA CONTA *****");
        System.out.println("|   Opção 1 - Poupança   |");
        System.out.println("|   Opção 2 - Corrente   |");
        int opcao = input.nextInt();

        if (opcao == 1) {
            ContaPoupanca conta = new ContaPoupanca(cliente, 0.05);
            contasBancarias.add(conta);
        } else if (opcao == 2) {
            Conta conta = new Conta(cliente);
            contasBancarias.add(conta);
        }
        else {
            System.out.println("XXXXXXXXXXXX Opção inválida XXXXXXXXXXXX");
        }
        System.out.println("***** Sua conta foi criada com sucesso! *****");
        operacoes();
        }

    private static Conta encontrarConta(int numeroConta) {
        Conta conta = null;
        if(contasBancarias.size() > 0) {
            for(Conta contaa : contasBancarias) {
                if(contaa.getNumeroConta() == numeroConta) {
                    conta = contaa;
                }
            }
        }
        return conta;
    }

    public static void depositar() {
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();
        Conta conta = encontrarConta(numeroConta);

        if(conta != null) {
            System.out.println("Qual valor deseja depositar? ");
            Double valorDeposito = input.nextDouble();

            conta.depositar(valorDeposito);
        }else {
            System.out.println("--- Conta não encontrada ---");
        }

        operacoes();

    }

    public static void sacar() {
        System.out.println("Número da conta: ");
        int numeroConta = input.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if(conta != null) {
            System.out.println("Qual valor deseja sacar? ");
            Double valorSaque = input.nextDouble();

            conta.sacar(valorSaque);
            System.out.println("--- Saque realizado com sucesso! ---");
        }else {
            System.out.println("--- Conta não encontrada ---");
        }

        operacoes();

    }

    public static void transferir() {

        System.out.println("|   Opção 1 - Transferir via Ted  |");
        System.out.println("|   Opção 2 - Voltar para o menu  |");

        int tranferencia = input.nextInt();;

        switch (tranferencia) {

            case 1:
                transferenciaTed();
                break;

            case 2:
                operacoes();
                break;

            default:
                System.out.println("Opção inválida!");
                transferir();
                break;
        }
    }

    public static void transferenciaTed() {
        System.out.println("Número da conta que vai enviar a transferência: ");
        int numeroContaRemetente = input.nextInt();

        Conta contaRemetente = encontrarConta(numeroContaRemetente);

        if(contaRemetente != null) {
            System.out.println("Número da conta do destinatário: ");
            int numeroContaDestinatario = input.nextInt();

            Conta contaDestinatario = encontrarConta(numeroContaDestinatario);

            if(contaDestinatario != null) {
                System.out.println("Valor da transferência: ");
                Double valor = input.nextDouble();

                contaRemetente.ted(contaDestinatario, valor);

            }else {
                System.out.println("--- A conta para depósito não foi encontrada ---");
            }

        }else {
            System.out.println("--- Conta para transferência não encontrada ---");
        }
        transferir();
    }

    public static void listarContas() {
        if(contasBancarias.size() > 0) {
            System.out.println("***** QUAIS CONTAS DESEJA LISTAR? *****");
            System.out.println("|   Opção 1 - Poupança   |");
            System.out.println("|   Opção 2 - Corrente   |");
            System.out.println("|   Opção 3 - Todas      |");
            int opcao = input.nextInt();

            switch (opcao){
                case 1:
                    for(Conta conta: contasBancarias) {
                        if (conta instanceof ContaPoupanca) {
                            System.out.println(conta);
                            System.out.println("Saldo c/ rendimento: ");
                            System.out.println("Tipo de Conta: Poupança");
                        }
                    }
                    break;
                case 2:
                    for(Conta conta: contasBancarias) {
                        if (!(conta instanceof ContaPoupanca)) {
                            System.out.println(conta);
                            System.out.println("Tipo de Conta: Corrente");
                        }
                    }
                    break;
                case 3:
                    for(Conta conta: contasBancarias) {
                        System.out.println(conta);
                        if (conta instanceof ContaPoupanca) {
                            System.out.println("Tipo de Conta: Poupança");
                        } else {
                            System.out.println("Tipo de Conta: Corrente");
                        }
                    }
                    break;
                default:
                    System.out.println("XXXXXXXXXXXX Opção inválida XXXXXXXXXXXX");
                    break;
            }
        }
        else {
            System.out.println("--- Não há contas cadastradas ---");
        }

        operacoes();
    }
}
