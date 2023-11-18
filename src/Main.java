import banco.Cliente;
import banco.Conta;
import banco.ContaCorrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        short operacao = 1;

        //receber informacoes do usuario/banco/tipo de conta cc ou poupanca

        do{
            System.out.println("\nPara depositar digite 2;");
            System.out.println("\nPara sacar digite 3;");
            System.out.println("\nPara transferir digite 4");
            //System.out.println("Para verificar seu saldo digite 5");
            short opcao = entrada.nextShort();

            switch (opcao) {
                case 2 -> {
                    System.out.println("\nInsira o valor que deseja depositar:");
                    double valorDepos = entrada.nextDouble();
                }
                case 3 -> {
                    System.out.println("\nInsira o valor que deseja sacar:");
                    double valorSaque = entrada.nextDouble();
                }
                //chamar metodo
                case 4 -> {
                    System.out.println("\nInsira o valor que deseja transferir:");
                    double valorTransf = entrada.nextDouble();
                }
                default -> {
                    System.out.println("\nVocê não digitou o número correto.\nTente novamente.");
                }
            }

            System.out.println("\nPara continuar digite '1', para sair digite '0'");
            operacao = entrada.nextShort();

        } while(operacao > 0);

        System.out.println("Volte sempre!");





        /*System.out.println("Insira seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Insira sua idade:");
        int idade = entrada.nextInt();

        System.out.println("Insira seu telefone:");
        int telefone = entrada.nextInt();

        Cliente cliente = new Cliente(nome,idade,telefone);

        System.out.println("Seu nome é "+cliente.nome+", sua idade é "+cliente.idade+", e seu telefone é "+ cliente.getTelefone());
        definir telefone como String ou double depois, por causa do tamanho de caracteres

        funcionando aqui
        */

        /*System.out.println("Insira sua agência:");
        String agencia = entrada.nextLine();

        System.out.println("Insira sua o número da sua conta:");
        int numConta = entrada.nextInt();

        System.out.println("Insira o valor que deseja sacar:");
        double valorSaque = entrada.nextDouble();

        ContaCorrente cc = new ContaCorrente(agencia, numConta);*/


        //limpar metodo main, otimizar ele






    }
}
