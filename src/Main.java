import banco.clientes.Cliente;
import banco.clientes.ListaClientes;
import banco.contas.ContaCorrente;
import banco.contas.ContaPoupanca;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        ListaClientes listaClientes = new ListaClientes();

        listaClientes.adicionarClientes("Abraham", 21, "(16)991802986", "505");

        System.out.println(listaClientes.pesquisaCpf("505"));



        //receber informacoes do usuario/banco/tipo de conta cc ou poupanca

       /* System.out.println("\nInsira sua agência:");
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

        // tratar o cliente depois

        /*System.out.println("Insira seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Insira sua idade:");
        int idade = entrada.nextInt();

        System.out.println("Insira seu telefone:");
        String telefone = entrada.nextInt();

        System.out.println("Insira seu cpf:");
        String cpf = entrada.nextLine();

        Cliente cliente = new Cliente(nome,idade,telefone, cpf);

        System.out.println("Seu nome é "+cliente.nome+", sua idade é "+cliente.idade+", e seu telefone é "+ cliente.getTelefone());
        definir telefone como String ou double depois, por causa do tamanho de caracteres

        funcionando aqui
        */


    }
}
