import banco.Cliente;
import banco.Conta;
import banco.ContaCorrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

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

        System.out.println("Insira sua agência:");
        String agencia = entrada.nextLine();

        System.out.println("Insira sua o número da sua conta:");
        int numConta = entrada.nextInt();

        ContaCorrente cc = new ContaCorrente(agencia, numConta);

        cc.deposito(105);

        cc.saque(500);
    // problema no if else, está permitindo sacar valor maior do que o saldo na conta




    }
}