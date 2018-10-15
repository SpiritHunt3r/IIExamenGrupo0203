/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso4_Composite;

/**
 *
 * @author ayma-93
 */
public class Numero implements ExpresionAritmetica{
     
    private int numero;

    public Numero(int numero) {
        this.numero = numero;
    }

    
    @Override/*
    public String escribir() {
        System.out.println(Integer.toString(numero));
    }*/
    public String escribir() {
        return Integer.toString(numero);
    }

    @Override
    public boolean validar() {
        return true;
    }
    
}
