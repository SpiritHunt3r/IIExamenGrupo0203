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

    public static Arma getArma(Raza raza, ArmaType tipo) {
        Arma a = null ;
        switch (raza){
            case Elfo :     a = new ArmaElfo(tipo); break;
            case Enano :   a = new ArmaEnano(tipo); break;
            case Orco:     a = new ArmaOrco(tipo); break;
            case Sauron:     a = new ArmaSauron(tipo); break;
            
        }
        return a;
    }
        
    
    
    
}
