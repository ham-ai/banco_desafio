package banco;

public class ContaCorrente extends Conta {


    public void deposito(double valor) {
        super.deposito(valor);
    }

    public void saque(double valor) {
        super.saque(valor);
    }


    public void transferencia(double valor) {
        super.transferencia(valor);
    }

    public ContaCorrente(String agencia, int numConta) {
        super(agencia, numConta);
    }
}
