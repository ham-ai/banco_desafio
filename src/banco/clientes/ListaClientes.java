package banco.clientes;

import java.util.ArrayList;
import java.util.List;

public class ListaClientes {

    private List<Cliente> clientesList;

    public ListaClientes(){
        this.clientesList = new ArrayList<>();
    }

    public void adicionarClientes(String nome, int idade, String telefone, String cpf){
        clientesList.add(new Cliente(nome, idade, telefone, cpf));
    }

    public List<Cliente> pesquisaCpf(String cpf){
        List<Cliente> clientesCpf = new ArrayList<>();

        if (!clientesList.isEmpty()){
            for (Cliente c : clientesList){
                if(c.getCpf().equalsIgnoreCase(cpf)){
                    clientesCpf.add(c);
                }
            }
        }
        return clientesCpf;
    }

}
