package banco;

public class Banco {

    public String agencia;
    public int numConta;

    public Banco(String agencia, int numConta) {
        this.agencia = agencia;
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }
    public int getNumConta() {
        return numConta;
    }
}