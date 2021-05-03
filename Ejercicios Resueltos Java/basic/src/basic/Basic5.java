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
public class Basic5 {

    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor de a investigar si es comun de 2 "));
        if (a % 2 == 0) {
            JOptionPane.showMessageDialog(null, "es divicible por 2");
        } else {
            JOptionPane.showMessageDialog(null, "no es divicible por 2");

        }
    }
}
