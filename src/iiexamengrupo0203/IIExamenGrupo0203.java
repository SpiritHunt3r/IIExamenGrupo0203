/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iiexamengrupo0203;

import Caso1_Factory.ArmaType;
import Caso4_Composite.ExpresionAritmetica;
import Caso4_Composite.Operador;
import Caso4_Composite.Numero;
import Caso1_Factory.FactoryArmas;
import Caso1_Factory.Raza;
import Caso3_Bridge.JVMTS;
import Caso3_Bridge.PreemptiveThreadScheduler;
import Caso3_Bridge.Sistema_Operativo;
import Caso3_Bridge.TimeSlicedThreadScheduler;
import Caso3_Bridge.UnixTS;
import Caso3_Bridge.WindowsTS;

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
        ArmaType arma = ArmaType.Daga;
        Raza tipo = Raza.Enano;
        System.out.println("Resultado Caso 1: ");
        System.out.println(factory.getArma(tipo,arma).toString());
        System.out.println("---------------------------------------------------------");
        
        //Fin Caso 1 Factory
        
        
        
        //Inicio Caso 3 Bridge
        
        System.out.println("Resultado Caso 3: ");
        Sistema_Operativo windows = new WindowsTS();
        Sistema_Operativo unix = new UnixTS();
        Sistema_Operativo java = new JVMTS();
        
        TimeSlicedThreadScheduler TsTS = new TimeSlicedThreadScheduler(unix);
        PreemptiveThreadScheduler PTS = new PreemptiveThreadScheduler(windows);
        TimeSlicedThreadScheduler TsTS1 = new TimeSlicedThreadScheduler(java);
        
        System.out.println(TsTS.Info());
        System.out.println(PTS.Info());
        System.out.println(TsTS1.Info());
        System.out.println();
        
        System.out.println("---------------------------------------------------------");
        //Fin Caso 3 Bridge
        
        //Inicio Caso 4 Composite
        
        //Expresion 7 + ( ( 5 * 6 ) - 8 )
        
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
        /*
        if(primerOperador.validar()){
            System.out.println(primerOperador.escribir());
        }
        System.out.println(primerOperador.validar());
        */
        System.out.println(primerOperador.validar());
        System.out.println(primerOperador.escribir());
        
        //Expresion 7 * 8 (3 / 2) 
        //Tiene mal formato
        
        ExpresionAritmetica op1 = new Operador("*");
        ExpresionAritmetica op2 = new Operador("/");
        ExpresionAritmetica num_1 = new Numero(7);
        ExpresionAritmetica num_2 = new Numero(8);
        ExpresionAritmetica num_3 = new Numero(3);
        ExpresionAritmetica num_4 = new Numero(2);
        
        ((Operador) op2).agregarOperando(num_3);
        ((Operador) op2).agregarOperando(num_4);
        
        ((Operador) op1).agregarOperando(num_1);
        ((Operador) op1).agregarOperando(num_2);
        ((Operador) op1).agregarOperando(op2);
        
        System.out.println(op1.validar());
        System.out.println(op1.escribir());
        /*
        if(op1.validar()){
            System.out.println(op1.escribir());
        }
        System.out.println(op1.validar());
       */
        System.out.println();
        System.out.println("---------------------------------------------------------");
        //Fin Caso 4 Composite
    }
    
}
