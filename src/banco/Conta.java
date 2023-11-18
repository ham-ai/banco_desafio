package banco;

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

        if (!((getSaldo() < 0) || (getSaldo() < valor))){
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);

            System.out.println("\nVocê sacou R$"+valor+" e ficou com R$"+ getSaldo() +" reais de saldo");
        }
        else{
            System.out.println("\nTentativa de saque, saldo insuficiente!");
        }

    };

    public void transferencia(double valor) {

        if (!((getSaldo() < 0) || (getSaldo() < valor))) {
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);

            System.out.println("\nVocê transferiu R$"+valor+" reais");
            System.out.println("Seu novo saldo é de R$"+ getSaldo() +" reais");
        }
        else {
            System.out.println("\nSeu saldo é insuficiente para realizar essa transferência!");
            System.out.println("\nSeu saldo: R$"+getSaldo()+"\nValor da transferência: R$"+valor);
        }

    };

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /* dar uma olhada nos métodos novamente, logica OU || funcionando
       deposito funcionando, implementar mesma logica nos metodos necessarios
    */



}
