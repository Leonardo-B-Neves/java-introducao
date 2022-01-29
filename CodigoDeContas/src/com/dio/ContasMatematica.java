package com.dio;

import java.util.Scanner;

public class ContasMatematica {
    public static void main(String[] args)
    {
        float numero1, numero2;
        Scanner ler = new Scanner(System.in);
        System.out.println("digite o primeiro numero");
        numero1 = ler.nextFloat();
        System.out.println("digite o segundo numero");
        numero2 = ler.nextFloat();
        System.out.println("Soma: "+soma(numero1, numero2));
        System.out.println("Subtração: "+subtracao(numero1, numero2));
        System.out.println("multiplicação: "+multiplica(numero1, numero2));
        System.out.println("divisão: "+divisao(numero1, numero2));

    }

    //retorna a + b
    private static float soma(float a, float b)
    {
        return a + b;

    }

    //retorna a - b
    private static float subtracao(float a, float b)
    {
        return a - b;
    }

    //retorna a * b
    private static float multiplica(float a, float b)
    {
        return a * b;
    }

    //retorna a / b
    private static float divisao(float a, float b)
    {
        return a / b;
    }

}
