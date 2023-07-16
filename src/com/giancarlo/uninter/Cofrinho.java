package com.giancarlo.uninter;

import java.util.ArrayList;

public class Cofrinho {

    //Lista de moedas
    ArrayList<Moeda> listaMoedas = new ArrayList<Moeda>();

    //Método para adicionar Moedas
    public void adicionar(Moeda moeda) {
        listaMoedas.add(moeda);
    }

    //Método para remover Moedas
    public void remover(Moeda moeda) {
        listaMoedas.remove(moeda);
    }

    //Método para listar Moedas
    public void listas() {
        for (Moeda moeda : listaMoedas) {
            moeda.info();
        }
    }

    public double totalConvertido(){
        if(listaMoedas.isEmpty()){
            return 0;
        }

        double totalReal = 0;

        //Para cada moeda na lista, ele irá converter e somar ao total.
        for(Moeda moeda : listaMoedas){
            totalReal += moeda.converter();
        }
        return totalReal;
    }

}