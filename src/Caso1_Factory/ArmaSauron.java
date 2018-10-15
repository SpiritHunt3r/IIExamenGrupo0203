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
public class ArmaSauron extends Arma{

    public ArmaSauron() {
        super(null, null);
    }
   
    public ArmaSauron(ArmaType arma) {
        super(Raza.Sauron, arma);
    }

    @Override
    public String toString() {
        return "Sauron " + super.toString() + "\n" ;
    }
    
    
}
