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
public class Basic8 {

    public static void main(String[] args) {
        int a = 1;
        while (a <= 100) {
            System.out.println(a);
            a++;
        }
        System.out.println("esto fue con el while, acontinuacion con el for");
        int b = 1;
        for (int i = 0; i < 100; i++) {
            System.out.println(b);
            b++;
        }
    }
}
