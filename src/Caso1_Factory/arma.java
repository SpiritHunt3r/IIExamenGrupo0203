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
public class arma {
    private String arma;
    private String tipo;
    
    public arma (String arma, String tipo){
        this.arma = arma;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return arma + " de " + tipo;
    }
    
    
}
