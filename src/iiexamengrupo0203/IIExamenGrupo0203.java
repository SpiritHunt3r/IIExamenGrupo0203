/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiexamengrupo0203;

import Caso1_Factory.FactoryArmas;
import Caso1_Factory.arma;


/**
 *
 * @author juan_
 */
public class IIExamenGrupo0203 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicio Caso 1 Factory 
        
        FactoryArmas factory = new FactoryArmas();
        arma construida;
        String solicitud = "elfo";//elfo, enano, orco, sauron
        construida = factory.getArma(solicitud);
        System.out.println(construida.toString());
        
        //Fin Caso 1 Factory
        
        
        
    }
    
}
