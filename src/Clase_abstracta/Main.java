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
public class Main {
    public static void main(String[] args) {
        
        //Animal gato = new Animal();
        Animal gato = new Gato();
        System.out.println(gato.noise());
    }
}
