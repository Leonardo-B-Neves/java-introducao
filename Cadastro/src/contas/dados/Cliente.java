package contas.dados;

public class Cliente {

    protected String nome;
    protected String CPF;
    protected int idade;

    public Cliente() {}

    public Cliente(String nome, String CPF, int idade)
    {

        this.nome = nome;
        this.CPF = CPF;
        this.idade = idade;

    }

    //mostra os dados de um cliente
    public void mostra (){
        System.out.println("nome: " + this.nome);
        System.out.println("CPF: " + this.CPF);
        System.out.println("idade: " + this.idade);
        System.out.println("\n");
    }

}
