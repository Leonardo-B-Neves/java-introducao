package contas;

import java.util.ArrayList;
import contas.dados.Cliente;

//Array que agrupa varios clientes cadastrados
public class ListaClientes {
    ArrayList lista = new ArrayList();

    public ListaClientes(){

    }
    //adiciona um cliente a lista
    public void novoCliente(String nome, String CPF, int idade){
        this.lista.add(new Cliente(nome, CPF, idade));

    }

    //extrai as classes contidas na lista e chama o mostra de Cliente
    public void mostra(){
        int tamanho = lista.size();
        Cliente cliente = new Cliente();
        for (int i = 0;i < tamanho; i++){
            cliente = (Cliente) lista.get(i);
            cliente.mostra();
        }

    }

}
