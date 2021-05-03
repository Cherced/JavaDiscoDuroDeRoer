/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import javax.swing.JOptionPane;

/**
 *
 * @author HITMA
 */
public class Array1 {

    /**
     * @param numeros
     */
    
    public static void llenarArray (int numeros  [] ){
        for (int i = 0; i < 10; i++) {
             int num = Integer.parseInt(JOptionPane.showInputDialog(null,"Ingresa numeros al array:"));
             numeros[i]  = num;
        }
 
    }
    public static void mostrarArray (int numeros [] ){
        for (int i = 1; i <= numeros.length ; i++) {
            System.out.println(i);
        }
            
        }
    
    public static void main(String[] args) {
        int numeros[];
        numeros = new int [10];
        
        llenarArray(numeros);
        mostrarArray(numeros);
        
       

        }
    
}
