import contas.ListaClientes;
import contas.dados.Cliente;
import java.util.Scanner;

public class Inicializador {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        ListaClientes array = new ListaClientes();
        String nome, CPF;
        int idade;
        System.out.println("0 para terminar e mostrar clientes ou algo diferente para cadastrar novo clientes");
        int escolha = leitor.nextInt();

        //faz o cadastro de mutiplos clientes
        while (escolha != 0){
            System.out.println("digite o nome do cliente");
            nome = leitor.next();
            System.out.println("digite o CPF do cliente");
            CPF = leitor.next();
            System.out.println("digite o idade do cliente");
            idade = leitor.nextInt();
            array.novoCliente(nome, CPF, idade);
            System.out.println("0 para terminar e mostrar clientes ou algo diferente para cadastrar novo clientes");
            escolha = leitor.nextInt();

        }
        //mostra os dados cadastrados
        array.mostra();
    }

}
