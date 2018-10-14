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

    public FactoryArmas() {
    }

    public arma getArma(String solicitud) {
        herrero herrero = null;
        switch (solicitud.toLowerCase()){
            case "elfo":
                herrero = new elfosFactory();
                break;
            case "enano":
                herrero = new enanosFactory();
                break;
            case "orco":
                herrero = new orcosFactory();
                break;
            case "sauron":
                herrero = new sauronFactory();
                break;
        }
        return herrero.construirArma();
    }

        
    
    
        
    
    
    
}
