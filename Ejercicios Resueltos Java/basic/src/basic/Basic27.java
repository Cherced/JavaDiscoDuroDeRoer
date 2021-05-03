/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

/**
 *
 * @author HITMA
 */
public class Basic27 {
    public static void main(String[] args) {
        String cadena= "Hola mundo";
         
        //CUIDADO: es 3 porque empieza en 0 las cadenas(cuarta letra)
        //el 5 es porque siempre hay que sumarle uno, ya que sino no mostraria lo que deseamos (quinta letra) 
        String subcadena = cadena.substring(3, 6);
      
        System.out.println(subcadena); 
    }
}
