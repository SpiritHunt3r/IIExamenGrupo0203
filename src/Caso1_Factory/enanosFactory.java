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
public class enanosFactory implements herrero {
    
    private arma arma;

    public enanosFactory() {
        this.arma = new arma("Hacha","Enanos"); 
    }

    @Override
    public arma construirArma() {
        return this.arma;
    }
    
}
