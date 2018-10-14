/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso1_Factory;

/**
 *
 * @author juan_
 */
public class FactoryArmas {

    arma construida;

    public FactoryArmas() {
    }

    public arma getArma(String solicitud) {
        herrero herrero = null;
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
        return construida;
    }

        
    
    
        
    
    
    
}
