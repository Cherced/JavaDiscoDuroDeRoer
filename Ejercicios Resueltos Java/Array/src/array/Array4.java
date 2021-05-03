/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author HITMA
 */
public class Array4 {
    private static double mediaArray (int tamaño){
        double media = (double) sumaArray(tamaño)/tamaño;
        return media;        
    }

    private static int sumaArray(int tamaño) {
        int num = 0;
        for (int i = 0; i <= tamaño; i++) {
            num += i;
        }
        return num;
    }

    public static void rellenarArregloConsecutivo(int array[]) {
        int num = 0;
        for (int i = 0; i < array.length; i++) {
            num += 1;
            array[i] = num;
        }
    }

    public static void mostrarArray(int array[]) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("En la posicion " + (1 + i) + " el arreglo almacena el numero: " + array[i]);
        }
        System.out.println("la suma de el arreglo es de: " + sumaArray(100));
        System.out.println("La media es de : " + mediaArray(100));
    }

    public static void main(String[] args) {
        int array[] = new int[100];
        rellenarArregloConsecutivo(array);
        mostrarArray(array);
    }

    /*  public static void main(String[] args) {
         
        //Creo un array
        int[] numeros=new int[100];
         
        //Declaro las variables necesarias
        int suma=0;
        double media;
         
        //Recorro el array, asigno números y sumo
        for(int i=0;i<numeros.length;i++){
            numeros[i]=i+1;
            suma+=numeros[i];
        }
         
        //Calculo la media y muestro la suma y la meda
        System.out.println("La suma es "+suma);
         
        media=(double)suma/numeros.length;
         
        System.out.println("La media es "+media);
         
    }
     */
}
