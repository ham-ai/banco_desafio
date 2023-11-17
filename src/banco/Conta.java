package banco;

import java.math.BigDecimal;
import java.math.RoundingMode;

public abstract class Conta extends Banco{
    private double saldo;

    public Conta(String agencia, int numConta) {
        super(agencia, numConta);
    }
    public void deposito(double valorDepos){
        double novoSaldo = getSaldo() + valorDepos;
        setSaldo(novoSaldo);

        System.out.println("\nVocê depositou R$"+valorDepos+" reais,\n" +
        "agora seu saldo é de R$"+ getSaldo() +" reais");
    };

    public void saque(double valor){

        if (!((getSaldo() < 0) && (getSaldo() < valor))){
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
        }
        else{
            System.out.println("Saldo insuficiente!");
        }

        System.out.println("Você sacou R$"+valor+" e ficou com R$"+ getSaldo() +" de saldo");
    };

    public void transferencia(double valor) {

        if (!((getSaldo() < 0) || (getSaldo() < valor))) {
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }

        System.out.println("\nVocê transferiu R$"+valor+" reais");
        System.out.println("Seu novo saldo é de R$"+ getSaldo() +" reais");
    };

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


}
