package com.dio;

import java.util.Scanner;

public class PagamentoComJuros {

    public static void main(String[] args) {
        //a quantia emprostada em reais
        float emprestimo,total;

        //valor dos juros
        final float juros = 1.2F;
        //quantia de parcelas
        int parcelas;

        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor do emprestimo");
        emprestimo = ler.nextFloat();
        System.out.println("Digite o numero de parcelas");
        parcelas = ler.nextInt();

        total = calculaValorTotalJuro(emprestimo, parcelas, juros);
        System.out.println("valor total a ser pago: " + total);
        System.out.println("valor por parcela: "+ (total / parcelas));

    }

    //retorna o valor total a ser pago com juro sobre juro de modo recurcivo
    private static float calculaValorTotalJuro(float emprestimo, int parcelas, final float juros)
    {
        if(parcelas == 1){
            return emprestimo;
        }else {
            return juros * calculaValorTotalJuro(emprestimo, (parcelas - 1), juros);
        }
    }

}
