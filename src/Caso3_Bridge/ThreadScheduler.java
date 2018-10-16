/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caso3_Bridge;

/**
 *
 * @author ayma-93
 */
public abstract class ThreadScheduler {
    protected Sistema_Operativo SO;

    public ThreadScheduler(Sistema_Operativo SO) {
        this.SO = SO;
    }
    
    public String Info(){
        return null;
    }
}
