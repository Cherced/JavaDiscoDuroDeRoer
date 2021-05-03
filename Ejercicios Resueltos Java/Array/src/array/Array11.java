/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author HITMA
 */
public class Array11 {
    public static void main(String[] args) {
 
        //Introducimos un numero
        String numero=JOptionPane.showInputDialog("Introduce un número");
 
        /*
         * Aprovechamos el String para averiguar la longitud del numero,
         * para crear un array compatible, y para dividirlo digitos
         */
        int digitos[]=convierteNumeroAArray(numero, numero.length());
 
        //Invocamos el metodo, segun el resultado mostramos un mensaje u otro
        if (EsCapicua(digitos)){
            System.out.println("El numero "+numero+" es capicua");
        }else{
            System.out.println("El numero "+numero+" no es capicua");
        }
    }
    public static int[] convierteNumeroAArray(String numero, int longitud){
 
        int digitos[]=new int[longitud];
 
        for(int i=0;i<digitos.length;i++){
            digitos[i]=Character.getNumericValue(numero.charAt(i));
        }
        return digitos;
    }
 
    public static boolean EsCapicua (int lista[]){
 
        //Creamos otro array
        int listaprueba[]=new int [lista.length];
 
        /*
         * Asignamos los valores al nuevo array lo hacemos añadiendo
         * los ultimos valores del primer array, al principio del nuevo array
         * ,es decir, le damos la vuelta al array
         */
        for (int i=0, j=1;j<=lista.length;i++, j++){
            listaprueba[i]=lista[lista.length-j];
        }
 
        //Usamos el metodo de java.util.Arrays para comparar los arrays
        if (Arrays.equals(lista, listaprueba)){
            return true;
        }
 
        return false;
 
    }
 

    
}
