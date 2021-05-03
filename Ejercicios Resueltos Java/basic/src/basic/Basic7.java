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
public class Basic7 {

    public static void main(String[] args) {
        final double IVA = 1.21;
        double precio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el precio del articulo"));
        JOptionPane.showMessageDialog(null, "El valor final con IVA de su producto es de: " + (precio * IVA));
    }
}
