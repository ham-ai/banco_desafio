abstract class Conta extends Banco{
    private String saldo;

    void deposito(int valor){};
    void saque(){};
    void transferencia(double valor){

        if(!getSaldo().isEmpty()){
            double
        }
        else{
            System.out.println("Saldo insuficiente!");
        }
    };

    public Conta(String agencia, int numConta) {
        super(agencia, numConta);
    }

    public String getSaldo() {
        return saldo;
    }

    public void setSaldo(String saldo) {
        this.saldo = saldo;
    }
}
