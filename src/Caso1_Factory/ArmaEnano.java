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
public class ArmaEnano extends Arma{

    public ArmaEnano() {
        super(null, null);
    }
   
    public ArmaEnano(ArmaType arma) {
        super(Raza.Enano, arma);
    }

    @Override
    public String toString() {
        return "Enano " + super.toString() + "\n" ;
    }
    
    
}
