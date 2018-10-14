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
        switch (solicitud.toLowerCase()){
            case "elfo":
                return new elfosFactory().construirArma();
            case "enano":
                return new enanosFactory().construirArma();
            case "orco":
                return new orcosFactory().construirArma();
            case "sauron":
                return new sauronFactory().construirArma();
                
        }
        return new arma("0","Examen");
    }

        
    
    
        
    
    
    
}
