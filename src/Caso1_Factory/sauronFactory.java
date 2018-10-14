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
public class sauronFactory implements herrero {
    
    private arma arma;

    public sauronFactory() {
        this.arma = new arma("Garrote","Sauron"); 
    }

    @Override
    public arma construirArma() {
        return this.arma;
    }
    
}
