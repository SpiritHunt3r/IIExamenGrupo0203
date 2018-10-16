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
public class PreemptiveThreadScheduler extends ThreadScheduler {
    
    public PreemptiveThreadScheduler(Sistema_Operativo SO) {
        super(SO);
    }
    
    @Override
    public String Info(){
        return SO.function() + "\nProcesando en Preemptive Scheduler";
    }
}
