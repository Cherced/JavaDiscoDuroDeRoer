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
public class Array15 {

    public static void main(String[] args) {

        //Creo el array
        int num1[] = new int[10];
        int num2[] = new int[10];

        //Comparo el contenido de ambos
        if (Arrays.equals(num1, num2)) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

    }

}
