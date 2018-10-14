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
public class orcos implements herrero {
    
    private arma arma;

    public orcos() {
        this.arma = new arma("Arma de Orcos"); 
    }

    @Override
    public arma construirArma() {
        return this.arma;
    }
    
}
