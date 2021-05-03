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
public class Basic12 {

    public static void main(String[] args) {
        int repeat = 0;
        int numero = 0;
        boolean constrain = false;

        do {
            numero = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero a evaluar en >=0 "));

            if (numero >= 0) {
                JOptionPane.showMessageDialog(null, "el numero es mayor o igual que 0");
                repeat = JOptionPane.showConfirmDialog(null, "Desea repetir el programa");
                constrain = repeat != 0;
            } else {
                JOptionPane.showMessageDialog(null, "el numero no es mayor o igual que 0, evalue otra vez");
                constrain = false;
            }

        } while (!constrain);

    }

}
