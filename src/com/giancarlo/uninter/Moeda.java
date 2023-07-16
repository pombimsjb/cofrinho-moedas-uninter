package com.giancarlo.uninter;

public abstract class Moeda {
    double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }
    public abstract void info();

    //Método abstrato para converter a moeda para Real.
    public abstract double converter();

    /*Método para sobrescrever o método Equals da classe object pois quando é chamado o método remove da classe ArrayList,
    a classe Object compara utilizando Equals os endereços de memória mas como o valor passado cria um novo objeto que
     utiliza um endereço de memória "novo" ele não faz a remoção.*/
    @Override
    public boolean equals(Object objeto){
        if(this.getClass() != objeto.getClass()){
            return false;
        }
        Moeda objetoDeMoeda = (Moeda) objeto;

        if( this.valor != objetoDeMoeda.valor){
            return false;
        }
        return true;
    }
}
