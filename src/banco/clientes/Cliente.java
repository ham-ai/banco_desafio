package banco.clientes;

public class Cliente {
    public String nome;
    public int idade;
    protected String telefone;
    private String cpf;

    public Cliente(String nome, int idade, String telefone, String cpf) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
        this.cpf = cpf;
    }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

}
