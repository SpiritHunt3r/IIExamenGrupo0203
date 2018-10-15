/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiexamengrupo0203;

import Caso4_Composite.ExpresionAritmetica;
import Caso4_Composite.Operador;
import Caso4_Composite.Numero;
import Caso1_Factory.FactoryArmas;

/**
 *
 * @author juan_
 */
public class IIExamenGrupo0203 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicio Caso 1 Factory 
        
        FactoryArmas factory = new FactoryArmas();
        String solicitud = "orco";//elfo, enano, orco, sauron
        System.out.println("Resultado Caso 1: ");
        System.out.println(factory.getArma(solicitud).toString());
        System.out.println("---------------------------------------------------------");
        
        //Fin Caso 1 Factory
        
        
        //Inicio Caso 4 Composite
        
        //crear expresion 7 + ( ( 5 * 6 ) - 8 )
        
        System.out.println("Resultado Caso 4: ");
        ExpresionAritmetica primerOperador = new Operador("+");
        ExpresionAritmetica segundoOperador1 = new Operador("*");
        ExpresionAritmetica segundoOperador2 = new Operador("-");
        ExpresionAritmetica num1 = new Numero(7);
        ExpresionAritmetica num2 = new Numero(5);
        ExpresionAritmetica num3 = new Numero(6);
        ExpresionAritmetica num4 = new Numero(8);
        
        ((Operador) segundoOperador1).agregarOperando(num2);
        ((Operador) segundoOperador1).agregarOperando(num3);
        
        ((Operador) segundoOperador2).agregarOperando(segundoOperador1);
        ((Operador) segundoOperador2).agregarOperando(num4);
        
        ((Operador) primerOperador).agregarOperando(num1);
        ((Operador) primerOperador).agregarOperando(segundoOperador2);
        
        if(primerOperador.validar()){
            System.out.println(primerOperador.escribir());
        } else System.out.println("false");
       
        System.out.println("---------------------------------------------------------");
        //Fin Caso 4 Composite
    }
    
}
