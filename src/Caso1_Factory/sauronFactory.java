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
public class sauronFactory  extends FactoryArmas {
    
    public static Arma getArma(ArmaType arma){
        return new ArmaSauron(arma);
    }
    
    
}
