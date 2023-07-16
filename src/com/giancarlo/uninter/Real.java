package com.giancarlo.uninter;

public class Real extends Moeda {
    //Construtor herdado da classe mãe.
    public Real(double valor) {
        super(valor);
    }

    @Override

    public void info(){
        //Método para imprimir o valor da moeda no cofrinho
        System.out.println("Total em reais no cofrinho: R$ " + valor);
    }

    @Override
    public double converter() {
        //Neste método é retornado apenas o valor total em Reais já que não é necessário fazer nenhuma conversão.
        return valor;
    }
}
