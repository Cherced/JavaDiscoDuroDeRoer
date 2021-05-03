/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic;

import javax.swing.JOptionPane;

/**
 *
 * @author HITMA
 */
public class Basic18 {

    public static void main(String[] args) {
            for (int i = 0; i < 100; i++) {
            int raiz = (int) Math.sqrt(i);
            int conut = 0;
            for (int j = raiz; j > 1; j--) {
                if (i % j == 0) {
                    conut++;
                }
            }
           if (conut < 1) {
                System.out.println(i);
            } 
        }

    }
}
