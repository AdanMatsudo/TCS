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
public abstract class Veiculo {
    protected String cor;
    protected boolean status;
    protected String modelo;
    protected int preco = 0;
    protected int pneu = 100;
    protected int combustivel = 100;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    public int getPneu() {
        return pneu;
    }

    public void setPneu(int pneu) {
        this.pneu = pneu;
    }

    public int getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(int combustivel) {
        this.combustivel = combustivel;
    }

    public Veiculo() {
        
    }
    
}
