/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Veiculos;

/**
 *
 * @author senai
 */
public class Caminhao extends Veiculo implements FuncionalidadesVeiculo {

    public Caminhao() {
        this.status = true;
        this.cor = "azul banana";
        this.modelo = "Scania";
        this.combustivel = 100;
        this.pneu = 100;
    }

    @Override
    public void mostrarCarac(){
        System.out.println("Ligado: " + this.status);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Combustivel: " + this.combustivel);
        System.out.println("Pneu: " + this.pneu);
    }
    
    @Override
    public void abastecerCarro() {
        if(this.combustivel < 100){
            this.combustivel = combustivel + 20;
            this.preco = preco + 4;
            System.out.println("Combustivel atual: " + this.combustivel);
            System.out.println("Valor total: " + this.preco);
        }else{
            System.out.println("Veiculo com combustivel no maximo");
        }
    }

    @Override
    public void ligarCarro() {
        if(this.status == false){
            this.status = true;
        }else{
            System.out.println("Veiculo ja ligado");
        }
    }

    @Override
    public void desligarCarro() {
        if(this.status == false){
            System.out.println("Veiculo ja desligado");
        }else{
            this.status = false;
        }
    }

    @Override
    public void ajustarPneu() {
        if(this.pneu < 100){
            this.pneu = pneu + 20;
            System.out.println("Combustivel atual: " + this.pneu);
        }else{
            System.out.println("Veiculo com o pneu regulado");
        }
    }

    @Override
    public void acelerar() {
        if(this.status == false){
            System.out.println("Veiculo desligado, ligue para acelerar!");
        }else{
            if(this.pneu == 0 || this.combustivel == 0){
                System.out.println("Calibrar o pneu ou abastecer o carro");
                System.out.println("Status atual do veiculo!\n");
                System.out.println("Combustivel: " + this.combustivel);
                System.out.println("Pneu: " + this.pneu);
            }else{
                this.pneu = pneu - 20;
                this.combustivel = combustivel - 20;
                System.out.println("VRUM VRUM VRUM!!");
                System.out.println("Status atual do veiculo!\n");
                System.out.println("Combustivel: " + this.combustivel);
                System.out.println("Pneu: " + this.pneu);
            }
        }
    }

    @Override
    public void statusVeiculo() {
        System.out.println("Status do veiculo: \n");
        System.out.println("Ligado: " + this.status);
        System.out.println("Combustivel: " + this.combustivel);
        System.out.println("Pneu: " + this.pneu);
    }
   
}
