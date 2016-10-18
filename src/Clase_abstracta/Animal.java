/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clase_abstracta;

/**
 *
 * @author Estudiante
 */
public abstract class Animal {

    private int numLegs;
    
    public int getNumLegs(){
    return this.numLegs;
    }
    public abstract String noise(); 
}
