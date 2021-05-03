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
public class Basic10 {

    public static void main(String[] args) {
        int numVentas = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero de ventas a calcular: "));
        double acomulado = 0;
        for (int i = 0; i < numVentas; i++) {

            double venta = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese la venta " + (i + 1)));
            acomulado = acomulado + venta;
        }
        JOptionPane.showMessageDialog(null, "El total de las ventas es de: " + (acomulado));
    }
}
