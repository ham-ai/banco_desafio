abstract class Conta extends Banco{
    private double saldo;

    void deposito(double valor){
        double novoSaldo = getSaldo() + valor;
        setSaldo(novoSaldo);

        System.out.println("Você depositou R$"+valor+" e seu saldo agora é de R$"+getSaldo());
    };

    void saque(double valor){

        if (!((getSaldo() < 0) && (getSaldo() < valor))){
            double novoSaldo = getSaldo() - valor;
            setSaldo(novoSaldo);
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
        System.out.println("Você sacou R$"+valor+" e ficou com R$"+getSaldo()+" de saldo");
    };

    void transferencia(double valor) {

        if (!((getSaldo() < 0) && (getSaldo() < valor))) {
            double novoSaldo = getSaldo() + valor;
            setSaldo(novoSaldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }

        System.out.println("Seu novo saldo é "+getSaldo());
    };

    public Conta(String agencia, int numConta) {
        super(agencia, numConta);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
