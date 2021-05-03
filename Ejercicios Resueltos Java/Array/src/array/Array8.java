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
public class Array8 {

    private static int numAleatorio(int a, int b) {
        int num = 0;
        num = (int) Math.floor(Math.random() * (a - b) + b);
        return num;
    }

    public static void rellenarArreglo(int array[]) {
        for (int i = 0; i < array.length; i++) {
            array[i] = numAleatorio(1, 300);
        }
    }

    public static int[] baulNumTerminadoEn(int[] array, int numFinder) {
        int baulNum[] = new int[array.length];
        int numFinal = 0;
        for (int i = 0; i < baulNum.length; i++) {
            numFinal = array[i] - (array[i] / 10 * 10);
            if (numFinder == numFinal) {
                baulNum[i] = array[i];
            }
        }
        return baulNum;
    }

  
    public static void mostrarArrayTerminadosEn(int array[]) {
        for (int i = 0; i < array.length; i++) {

            if (array[i] != 0) {
                System.out.println("El numero " + array[i] + " acaba en el numero deseado");
            }
        }
    }

    public static void main(String[] args) {
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el tamaño de su array:"));
        int array[] = new int[tamaño];
        int numFinder;
        do {
            numFinder = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el digito por el que finaliza el dato a buscar :"));
        } while (!(numFinder >= 0 && numFinder <= 9));
        rellenarArreglo(array);
        int baulNumTerminadoEn [] = baulNumTerminadoEn(array, numFinder);
        mostrarArrayTerminadosEn(baulNumTerminadoEn);

    }

}
