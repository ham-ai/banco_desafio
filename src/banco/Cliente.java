package banco;

public class Cliente {
    public String nome;
    public int idade;
    protected int telefone;

    public Cliente(String nome, int idade, int telefone) {
        this.nome = nome;
        this.idade = idade;
        this.telefone = telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }
    public int getTelefone() {
        return telefone;
    }
}
