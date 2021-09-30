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
public class CamaroteInferior extends VIP{
    private String localIngresso;

    public String getLocalIngresso() {
        return localIngresso;
    }

    public void setLocalIngresso(String localIngresso) {
        this.localIngresso = localIngresso;
    }
    
    public void imprimeLocal(){
        System.out.println(this.getLocalIngresso());
    }
    
}
