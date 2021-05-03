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
public class Array3 {

    private static int numAleatorio(int a, int b) {
        int num = 0;
        num = (int) Math.floor(Math.random() * (a - b) + b);
        return num;
    }

    public static void rellenarArreglo(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = numAleatorio(0, 9);
        }
    }
    
    public static void mostrarArray (int array []){
        for (int i = 0; i < array.length; i++) {
            System.out.println("En la posicion "+(1+i)+" el arreglo almacena el numero: " + array[i]);  
        }
    }
    
    public static void main(String[] args) {
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el tamaño del arreglo"));
        int array []= new int [tamaño];
        rellenarArreglo(array);
        mostrarArray(array);
    }

}
