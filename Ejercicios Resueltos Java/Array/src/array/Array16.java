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
public class Array16 {
      public static void main(String[] args) {
         
        //Creo el array
        int num[]=new int[5];
         
        //Asigno valores
        num[0]=6;
        num[1]=3;
        num[2]=9;
        num[3]=4;
        num[4]=1;
         
        //ordeno
        Arrays.sort(num);
         
        //Muestro el array
        for(int i=0;i<num.length;i++){
            System.out.println(num[i]);
        }
         
    }
    
}
