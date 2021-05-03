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
public class Basic9 {

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero a evaluar en comunes de 2 y 3:"));
        if (num % 2 == 0) {
            JOptionPane.showMessageDialog(null, "El numero: " + (num) + " es divicible entre 2 ");
        } else if (num % 3 == 0) {
            JOptionPane.showMessageDialog(null, "El numero: " + (num) + " es divicible entre 3 ");

        } else {
            JOptionPane.showMessageDialog(null, "El numero: " + (num) + " no es divicible entre 2, ni 3");

        }

    }
}
