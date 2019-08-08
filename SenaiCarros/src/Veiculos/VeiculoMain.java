/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veiculos;

import java.io.Console;
import java.util.Scanner;

/**
 *
 * @author senai
 */
public class VeiculoMain {
    
    static int opcao = 0;
    public static void main(String[] args) {
        
        int opcaoMenu = 0;
        Carro carro = new Carro();
        
        Scanner sc1 = new Scanner(System.in);
        
        
        
        
        do{
            System.out
				.println("\n\n### Veiculos Senai ###");
		System.out.println("\n                  =========================");
		System.out.println("                  |     1 - Carro         |");
		System.out.println("                  |     2 - Moto      |");
		System.out.println("                  |     3 - Caminhão        |");
		System.out.println("                  |     0 - Sair          |");
		System.out.println("                  =========================\n");
                
                System.out.println("Opção: ");
                opcaoMenu = sc1.nextInt();
                System.out.println("\n");
                
            switch(opcaoMenu){
                case 1:
                    menuCarro();
                    break;
                case 2:
                    menuMoto();
                    break;
                case 3:
                    menuCaminhao();
                    break;
                case 0:
                    break;
                default: 
                    System.out.println("Opção invalida!");
                    break;
            }
        }while(opcaoMenu != 0);
        
    }
    
    public static void menuCarro(){
        Scanner sc = new Scanner(System.in);
        Carro carro = new Carro();
        do{
            System.out
				.println("\n\n### Veiculos Senai ###");
		System.out.println("\n                  =========================");
		System.out.println("                  |     1 - Ligar Carro         |");
		System.out.println("                  |     2 - Desligar Carro      |");
		System.out.println("                  |     3 - Status do Carro        |");
		System.out.println("                  |     4 - Abastecer Carro       |");
		System.out.println("                  |     5 - Calibrar Pneu Carro       |");
		System.out.println("                  |     6 - Mostrar Caractteristicas Carro    |");
                System.out.println("                  |     7 - Acelerar Carro    |");
		System.out.println("                  |     0 - Sair          |");
		System.out.println("                  =========================\n");
                
                System.out.println("Opção: ");
                opcao = sc.nextInt();
                System.out.println("\n");
                
                switch(opcao){
                    case 1:
                       carro.ligarCarro();
                        break;
                    case 2:
                        carro.desligarCarro();
                        break;
                    case 3:
                        carro.statusVeiculo();
                        break;
                    case 4:
                        carro.abastecerCarro();
                        break;
                    case 5:
                        carro.ajustarPneu();
                        break;
                    case 6:
                        carro.mostrarCarac();
                        break;
                    case 7:
                        carro.acelerar();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção invalida!");
                        break;
                }
        }
        while(opcao != 0);
    }
    
    public static void menuMoto(){
        Scanner sc = new Scanner(System.in);
        Moto moto = new Moto();
        do{
            System.out
				.println("\n\n### Veiculos Senai ###");
		System.out.println("\n                  =========================");
		System.out.println("                  |     1 - Ligar Moto         |");
		System.out.println("                  |     2 - Desligar Moto      |");
		System.out.println("                  |     3 - Status da Moto        |");
		System.out.println("                  |     4 - Abastecer Moto       |");
		System.out.println("                  |     5 - Calibrar Pneu da Moto       |");
		System.out.println("                  |     6 - Mostrar Caractteristicas Moto    |");
                System.out.println("                  |     7 - Acelerar Moto    |");
		System.out.println("                  |     0 - Sair          |");
		System.out.println("                  =========================\n");
                
                System.out.println("Opção: ");
                opcao = sc.nextInt();
                System.out.println("\n");
                
                switch(opcao){
                    case 1:
                        moto.ligarCarro();
                        break;
                    case 2:
                        moto.desligarCarro();
                        break;
                    case 3:
                        moto.statusVeiculo();
                        break;
                    case 4:
                        moto.abastecerCarro();
                        break;
                    case 5:
                        moto.ajustarPneu();
                        break;
                    case 6:
                        moto.mostrarCarac();
                        break;
                    case 7:
                        moto.acelerar();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção invalida!");
                        break;
                }
        }
        while(opcao != 0);
    }
    
    public static void menuCaminhao(){
        Scanner sc = new Scanner(System.in);
        Caminhao caminhao = new Caminhao();
        do{
            System.out
				.println("\n\n### Veiculos Senai ###");
		System.out.println("\n                  =========================");
		System.out.println("                  |     1 - Ligar Caminhao         |");
		System.out.println("                  |     2 - Desligar Caminhao      |");
		System.out.println("                  |     3 - Status do Caminhao        |");
		System.out.println("                  |     4 - Abastecer Caminhao       |");
		System.out.println("                  |     5 - Calibrar Pneu do Caminhao       |");
		System.out.println("                  |     6 - Mostrar Caractteristicas Caminhao    |");
                System.out.println("                  |     7 - Acelerar Caminhao    |");
		System.out.println("                  |     0 - Sair          |");
		System.out.println("                  =========================\n");
                
                System.out.println("Opção: ");
                opcao = sc.nextInt();
                System.out.println("\n");
                
                switch(opcao){
                    case 1:
                        caminhao.ligarCarro();
                        break;
                    case 2:
                        caminhao.desligarCarro();
                        break;
                    case 3:
                        caminhao.statusVeiculo();
                        break;
                    case 4:
                        caminhao.abastecerCarro();
                        break;
                    case 5:
                        caminhao.ajustarPneu();
                        break;
                    case 6:
                        caminhao.mostrarCarac();
                        break;
                    case 7:
                        caminhao.acelerar();
                        break;
                    case 0:
                        break;
                    default:
                        System.out.println("Opção invalida!");
                        break;
                }
        }
        while(opcao != 0);
    }
}
