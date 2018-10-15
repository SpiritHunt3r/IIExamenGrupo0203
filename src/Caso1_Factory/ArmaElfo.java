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
public class ArmaElfo extends Arma{

    public ArmaElfo() {
        super(null, null);
    }
   
    public ArmaElfo(ArmaType arma) {
        super(Raza.Elfo, arma);
    }

    @Override
    public String toString() {
        return "Elfica " + super.toString() + "\n" ;
    }
    
    
}
