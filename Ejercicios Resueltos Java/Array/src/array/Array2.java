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
public class Array2 {
    //creo chequeador de numeros primos:
    private static boolean esPrimo(int num){
        if (num<=1) {
             return false;
        } else {
           // delcaramos
           int prub;
           int contador = 0;
           //sacamos raiz ala prueba, y dividimos el numero original
           prub = (int)Math.sqrt(num);
           //lo metemos en bucle para saber cuantos divisibles tiene.
            for (;prub >1;prub--) {
                if (num%prub == 0){
                    contador+=1;                
                }
            }
            return contador <1;
        }    
        
    }
    
    
    public static int mayor(int lista[]){
        int mayor=0;
        for(int i=0;i<lista.length;i++){
            if(lista[i]>mayor){
                mayor=lista[i];
            }
        }         
        return mayor;
    }
    
    
     public static void mostrarArray (int arrayAleatorio[] ){
        for (int i = 1; i <= arrayAleatorio.length ; i++) {
            System.out.println("en el indice "+i+ " el valor es " + arrayAleatorio[i]);
        }
     }
    //metodo para rellenado con aleatorios
    public static void rellenarAletoriamentePrimos(int arrayAleatorio[], int a, int b, int num) {
        for (int i = 0; i < arrayAleatorio.length; i++) {
            num = (int) Math.floor(Math.random() * (a - b) + b);
            if (esPrimo(num) ) {
                arrayAleatorio [i] = num;
                i++;
            }
        }
    }

    public static void main(String[] args) {
        //acontinuacion creamos el tamaño del array
        int tamanio = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el tamaño de su array"));
        int arrayAleatorio[] = new int[tamanio];
        
        rellenarAletoriamentePrimos(arrayAleatorio, 0, 100, 0);
        mostrarArray(arrayAleatorio);
        mayor(arrayAleatorio);
    }
}
