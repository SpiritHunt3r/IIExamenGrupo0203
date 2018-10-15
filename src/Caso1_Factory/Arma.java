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
public abstract class Arma {
    private Raza tipo;
    private ArmaType arma;
   

    public Arma(Raza tipo, ArmaType arma) {
        this.tipo = tipo;
        this.arma = arma;
    }

    @Override
    public String toString() {
        return "Arma{" + "Raza=" + tipo + ", Arma=" + arma + '}';
    }
    
    
}
