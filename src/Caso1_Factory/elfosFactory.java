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
public class elfosFactory implements herrero {
    
    private arma arma;

    public elfosFactory() {
        this.arma = new arma("Daga","Elfos"); 
    }

    @Override
    public arma construirArma() {
        return this.arma;
    }
    
}
