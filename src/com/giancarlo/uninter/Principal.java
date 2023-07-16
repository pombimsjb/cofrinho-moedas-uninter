package com.giancarlo.uninter;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Cofrinho cofrinho = new Cofrinho();

        int opcaoMenu;
        int tipoMoeda;
        double valor;
        Moeda moedas;

        do {
            System.out.println("Gerenciamento de Cofrinho");
            System.out.println("1 - Adicionar Moeda");
            System.out.println("2 - Remover Moeda");
            System.out.println("3 - Listar Moedas");
            System.out.println("4 - Total Convertido para Real");
            System.out.println("0 - Encerrar");


            try {
                opcaoMenu = leitor.nextInt();
                switch (opcaoMenu) {
                    case 0:{
                        System.out.println("Obrigado por utilizar nosso sistema, volte sempre!");
                        break;
                    }
                    case 1:{
                        // Invoca o método adicionar para então inserir determinada moeda em nosso cofrinho.
                        tipoMoeda = 0;
                        // Utilizado enquanto para solicitar nova opção caso o usuário digite uma opção incorreta
                        while (tipoMoeda > 3 || tipoMoeda <= 0) {
                            System.out.println("Escolha a Moeda");
                            System.out.println("1 - Real");
                            System.out.println("2 - Euro");
                            System.out.println("3 - Dolar");
                            tipoMoeda = leitor.nextInt();
                            moedas = null;
                            if (tipoMoeda == 1) {
                                System.out.println("Digite o valor: ");
                                valor = leitor.nextDouble();
                                moedas = new Real(valor);
                            } else if (tipoMoeda == 2) {
                                System.out.println("Digite o valor: ");
                                valor = leitor.nextDouble();
                                moedas = new Euro(valor);
                            } else if (tipoMoeda == 3) {
                                System.out.println("Digite o valor: ");
                                valor = leitor.nextDouble();
                                moedas = new Dolar(valor);
                            }
                            // Adiciona o valor na lista do cofrinho
                            cofrinho.adicionar(moedas);
                        }
                        break;
                    }

                    case 2:{
                        // Invoca o método remover para poder iniciar a remoção de uma determinada moeda de nosso Cofrinho.
                        tipoMoeda = 0;
                        // Utilizado enquanto para solicitar nova opção caso o usuário digite uma opção incorreta
                        while (tipoMoeda > 3 || tipoMoeda <= 0) {
                            System.out.println("Escolha a Moeda");
                            System.out.println("1 - Real");
                            System.out.println("2 - Euro");
                            System.out.println("3 - Dolar");
                            tipoMoeda = leitor.nextInt();
                            moedas = null;
                            if (tipoMoeda == 1) {
                                System.out.println("Digite o valor: ");
                                valor = leitor.nextDouble();
                                moedas = new Real(valor);
                            } else if (tipoMoeda == 2) {
                                System.out.println("Digite o valor: ");
                                valor = leitor.nextDouble();
                                moedas = new Euro(valor);
                            } else if (tipoMoeda == 3) {
                                System.out.println("Digite o valor: ");
                                valor = leitor.nextDouble();
                                moedas = new Dolar(valor);
                            }
                            cofrinho.remover(moedas);
                        }
                        break;
                    }


                    case 3:{

                        // Invoca o método listar moedas as moedas em nosso cofrinho
                        cofrinho.listas();
                        break;

                    }


                    case 4:{

                        // Invoca o método para converter todas a moedas para Real e então somar em um total de Reais!
                        double total = cofrinho.totalConvertido();
                        System.out.println("O Valor total convertido para Real é R$ " + total);
                        break;

                    }


                    default:{

                        System.out.println("Opção inválida, escolha uma das opções abaixo:");

                    }

                }
            }catch (Exception erro){
                System.out.println("Ocorreu o seguinte erro: " + erro.getMessage());
                leitor.nextLine();
                opcaoMenu = -1;
            }
        } while (opcaoMenu != 0);

        leitor.close(); // Fecha o Scanner
    }
}
