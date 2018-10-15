/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso4_Composite;

import java.util.ArrayList;

/**
 *
 * @author ayma-93
 */
public class Operador implements ExpresionAritmetica{
    private String operador;
    private ArrayList<ExpresionAritmetica> operandos;

    public Operador(String operador) {
        this.operador = operador;
        this.operandos = new ArrayList<>();
    }
    
    public void agregarOperando(ExpresionAritmetica exp){
        operandos.add(exp);
    }
    
    @Override
    public boolean validar(){
        if(operandos.size() != 2){
            
            return false;
            
        } else return operandos.get(0).validar() && operandos.get(1).validar();
    }
    

    @Override
    public String escribir(){
        

        if(operandos.isEmpty()){

            return " ".concat(operador).concat(" ");
        }else {
            String res = "";
            ExpresionAritmetica tmp;
            for (int i = 0; i < operandos.size(); i++) {
                tmp = operandos.get(i);
                if(i == 1){
                    res = res.concat(" ".concat(operador).concat(" "));
                }
                if(tmp.getClass() == Operador.class){
                    
                    res = res.concat(" ( ".concat(tmp.escribir()).concat(" ) "));

                }else {
                    res = res.concat(tmp.escribir());
                }
            }
            return res;
        }
        /*
        if(operandos.get(0).getClass() == Operador.class && operandos.get(1).getClass() != Operador.class){
            
            return " ( ".concat(operandos.get(0).escribir()).concat(" ) " + operador + " ").concat(operandos.get(1).escribir());
            
        } else if(operandos.get(0).getClass() != Operador.class && operandos.get(1).getClass() == Operador.class){
            
            return operandos.get(0).escribir().concat(" " + operador + " ( ").concat(operandos.get(1).escribir()).concat(" ) ");
            
        } else if(operandos.get(0).getClass() == Operador.class && operandos.get(1).getClass() == Operador.class){
            
            return " ( ".concat(operandos.get(0).escribir()).concat(" ) " + operador + " ( ").concat(operandos.get(1).escribir()).concat(" ) ");
            
        } else return operandos.get(0).escribir().concat(" " + operador + " ").concat(operandos.get(1).escribir());
*/
    } 
    
}
