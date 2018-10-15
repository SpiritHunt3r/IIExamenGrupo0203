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
public class ArmaOrco extends Arma{

    public ArmaOrco() {
        super(null, null);
    }
   
    public ArmaOrco(ArmaType arma) {
        super(Raza.Orco, arma);
    }

    @Override
    public String toString() {
        return "Orco " + super.toString() + "\n" ;
    }
    
    
}