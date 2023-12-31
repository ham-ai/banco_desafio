package banco.contas;

import java.util.Scanner;

public class ContaCorrente extends Conta {

    public ContaCorrente(String agencia, int numConta) {
        super(agencia, numConta);
    }

    public void deposito(double valor) {
        super.deposito(valor);
    }

    public void saque(double valor) {
        super.saque(valor);
    }

    public void transferencia(double valor) {
        super.transferencia(valor);
    }

    public void operacoesContaCorrente(){
        short operacao = 1;

        Scanner entrada = new Scanner(System.in);

        do{

            System.out.println("\nPara depositar digite 2;");
            System.out.println("\nPara sacar digite 3;");
            System.out.println("\nPara transferir digite 4");
            System.out.println("\nPara verificar seu saldo digite 5");

            short opcao = entrada.nextShort();

            switch (opcao) {
                case 2 -> {
                    System.out.println("\nInsira o valor que deseja depositar:");
                    double valorDepos = entrada.nextDouble();
                    deposito(valorDepos);
                }
                case 3 -> {
                    System.out.println("\nInsira o valor que deseja sacar:");
                    double valorSaque = entrada.nextDouble();
                    saque(valorSaque);
                }
                case 4 -> {
                    System.out.println("\nInsira o valor que deseja transferir:");
                    double valorTransf = entrada.nextDouble();
                    transferencia(valorTransf);
                }
                case 5 ->{
                    System.out.println("\nSeu saldo atual é R$"+getSaldo()+" reais");
                }
                default -> {
                    System.out.println("\nVocê não digitou o número correto.\nTente novamente.");
                }
            }

            System.out.println("\nPara continuar digite '1', para sair digite '0'");
            operacao = entrada.nextShort();

        } while(operacao > 0);

        System.out.println("\nVolte sempre!\nAgradecemos por utilizar nossos serviços");
    }

}
