/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;

/**
 *
 * @author HITMA
 */
public class Array14 {

    public static void main(String[] args) {

        //Creo el array
        int num[] = new int[10];

        //Rellenamos el array con 1
        Arrays.fill(num, 1);

        //Copiamos de las posiciones 2 a la 9 (7 posiciones tendra)
        int num2[] = Arrays.copyOfRange(num, 2, 9);

        //Muestro el array
        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }

    }
}
