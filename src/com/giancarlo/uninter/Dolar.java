package com.giancarlo.uninter;

public class Dolar extends Moeda {

    //Construtor herdado da classe mãe.
    public Dolar(double valor) {
        super(valor);
    }

    @Override
    public void info(){
        //Método para imprimir o valor da moeda no cofrinho
        System.out.println("Total em dólares no cofrinho: $ " + valor);
    }

    @Override
    public double converter() {
        //Método para converter o total da moeda para Real.
        return valor * 4.78; // Taxa de câmbio do dia 24/06 utilizado.
    }

}
