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
public class Basic17 {

    public static void main(String[] args) {
        boolean back = false;
        int num = 0;
        int continuee = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dato a evaluar"));
            if (num <= 1) {
                JOptionPane.showMessageDialog(null, "el numero " + (num) + " no es primo");
            } else {
                int raiz = (int) Math.sqrt(num);
                int conut = 0;
                for (int i = raiz; i > 1; i--) {
                    if (num % i == 0) {
                        conut++;
                    }
                }
                if (conut < 1) {
                    JOptionPane.showMessageDialog(null, "el numero " + (num) + " es primo");
                } else {
                    JOptionPane.showMessageDialog(null, "el numero " + (num) + " no es primo");
                }
            }
        } while (!back);
    }
}
