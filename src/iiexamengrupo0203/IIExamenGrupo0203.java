/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiexamengrupo0203;

import Caso1_Factory.arma;
import Caso1_Factory.elfos;
import Caso1_Factory.enanos;
import Caso1_Factory.herrero;
import Caso1_Factory.orcos;
import Caso1_Factory.sauron;

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
        herrero herrero = null;
        arma construida;
        String solicitud = "orco";//elfo, enano, orco, sauron
        switch (solicitud.toLowerCase()){
            case "elfo":
                herrero = new elfos();
                break;
            case "enano":
                herrero = new enanos();
                break;
            case "orco":
                herrero = new orcos();
                break;
            case "sauron":
                herrero = new sauron();
                break;
        }
        construida = herrero.construirArma();
        System.out.println(construida.toString());
        //Fin Caso 1 Factory
        
        
        
    }
    
}
