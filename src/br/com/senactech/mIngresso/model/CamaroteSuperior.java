/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.mIngresso.model;

/**
 *
 * @author jairb
 */
public class CamaroteSuperior extends VIP {

    private double valorCS = this.getValorVIP() + 3;

    public double getValorCS() {
        return valorCS;
    }
    
    @Override
    public void imprimeValor(){
        System.out.println(this.getValorCS());
    }

      

}
