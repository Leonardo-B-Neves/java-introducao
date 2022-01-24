package com.dio.base;

//classe que retorna o code formatado
public class Order {
    private final String code;

    //entrada do code
    public Order(String code) {
        this.code = code;
    }

    //saida do code
    @Override
    public String toString(){
        return "Order=("+
                "code'"+
                code +
                "'" + "}";
    }
}