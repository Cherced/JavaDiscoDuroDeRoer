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
public class Basic2 {

    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor de a"));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor de b"));

        if (a > b) {
            JOptionPane.showMessageDialog(null, "El dato de a " + (a) + " es mayor que b " + (b));
        } else if (a < b) {
            JOptionPane.showMessageDialog(null, "El dato de a " + (a) + " es menor que b " + (b));
        } else {
            JOptionPane.showMessageDialog(null, "los datos son iguales\n a = " + (a) + " b = " + (b));
        }
    }

}
