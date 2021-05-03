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
public class Array13 {
    public static void main(String[] args) {
        int num[] = new int [10];
        Arrays.fill(num, 20);
        Arrays.fill(num,3, num.length, -1);
        for (int i = 0; i < num.length ; i++) {
            System.out.println(num[i]);
        }
    }
    
}
