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
public class Array7 {

    private static int numAleatorio(int a, int b) {
        int num = 0;
        num = (int) Math.floor(Math.random() * (a - b) + b);
        return num;
    }

    public static void rellenarArreglo(int array1[]) {
        for (int i = 0; i < array1.length; i++) {
            array1[i] = numAleatorio(0, 100);
        }
    }

    public static int[] multiplicandoArrays(int array1[], int array2[]) {
        int array3[] = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i] * array2[i];
        }
        return array3;
    }

    public static void mostrarArray(int array3[], int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            System.out.println("en el indice " + (i+1) + " el valor del array1 es de " + array1[i] + " y en el array2 es de " + array2[i] + " el resultado de multiplicarlos es :" + array3[i]);
        }
    }

    public static void main(String[] args) {
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el tamaño de su array:"));
        int array1[] = new int[tamaño];
        int array2[];
        rellenarArreglo(array1);
        array2 = array1;
        array1 = new int[tamaño];
        rellenarArreglo(array1);
        int array3[] = multiplicandoArrays(array1, array2);
        mostrarArray(array3, array1, array2);

    }

}
