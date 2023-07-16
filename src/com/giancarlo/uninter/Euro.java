package com.giancarlo.uninter;

public class Euro extends Moeda {
    //Construtor herdado da classe mãe.
    public Euro(double valor) {
        super(valor);
    }
    @Override
    public void info(){
        //Método para imprimir o valor da moeda no cofrinho
        System.out.println("Total em euros no cofrinho: € " + valor);
    }

    @Override
    public double converter() {
        //Método para converter o total da moeda para Real.
        return valor * 5.23; // Taxa de câmbio do dia 24/06 utilizado.
    }

}
