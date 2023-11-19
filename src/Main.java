import banco.clientes.Cliente;
import banco.clientes.ListaClientes;
import banco.contas.ContaCorrente;
import banco.contas.ContaPoupanca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ListaClientes listaClientes = new ListaClientes();

        Scanner entrada = new Scanner(System.in);

        // cadastro de usuario
            short sair = 1;

            do{

                System.out.println("\nInsira seu nome:");
                String nome = entrada.next();

                System.out.println("\nInsira sua idade:");
                int idade = entrada.nextInt();

                System.out.println("\nInsira seu telefone:");
                String telefone = entrada.next();

                System.out.println("\nInsira seu CPF:");
                String cpf = entrada.next();

                System.out.println("\nSeu nome é " +nome+ ", sua idade é " +idade+
                ", seu telefone é "+ telefone +", e seu CPF é " + cpf);

                System.out.println("\nAs informações acima estão corretas? Se sim digite '0', se não digite '1'");
                sair = entrada.nextShort();


                if (sair == 0){
                    listaClientes.adicionarClientes(nome, idade, telefone, cpf); //lista funcionando

                    System.out.println("Usuário cadastrado com sucesso!");
                    System.out.println(listaClientes.pesquisaCpf(cpf));
                }

            }
            while(sair > 0);


        //entrada de dados conta/agencia
       /* System.out.println("\nAgora vamos acessar sua conta!");

        System.out.println("\nInsira sua agência:");
        String agencia = entrada.nextLine();

        System.out.println("\nInsira sua o número da sua conta:");
        int numConta = entrada.nextInt();

        System.out.println("Para acessar sua conta corrente digite '1'." +
        "\nPara acessar sua conta poupança digite '2'.");

        short contaTipo = entrada.nextShort();

        if (contaTipo == 1){
            ContaCorrente contaCorrente = new ContaCorrente(agencia, numConta);
            contaCorrente.operacoesContaCorrente();

        } else if (contaTipo == 2) {
            ContaPoupanca contaPoupanca = new ContaPoupanca(agencia, numConta);
            contaPoupanca.operacoesContaPoupanca();
        }
        else System.out.println("Insira um número válido!");
*/





    }
}
