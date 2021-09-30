/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mingresso;

import br.com.senactech.mIngresso.model.CamaroteInferior;
import br.com.senactech.mIngresso.model.CamaroteSuperior;
import br.com.senactech.mIngresso.model.Normal;
import br.com.senactech.mIngresso.model.VIP;

/**
 *
 * @author jairb
 */
public class MIngresso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Normal n = new Normal();
        n.tipoIngresso();
        n.setValor(6);
        n.imprimeValor();
        System.out.println("\nIngresso VIP");
        VIP v = new VIP();
        v.imprimeValor();
        System.out.println("\nIngresso Camarote Inf.");
        CamaroteInferior ci = new CamaroteInferior();
        ci.imprimeValor();
        ci.setLocalIngresso("CI1");
        System.out.println("Local: " + ci.getLocalIngresso());
        System.out.println("\nIngresso Camarote Sup.");
        CamaroteSuperior cs = new CamaroteSuperior();
        cs.imprimeValor();
        
    }
    
}
