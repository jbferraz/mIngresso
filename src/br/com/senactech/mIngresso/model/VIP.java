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
public class VIP extends Ingresso {

    private double valorVIP = this.getValor() + 3;

    public double getValorVIP() {
        return valorVIP;
    }

    public void setValorVIP(double valorVIP) {
        this.valorVIP = valorVIP;
    }

    @Override
    public void imprimeValor() {
        System.out.println(getValorVIP());
    }
}
