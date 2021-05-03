/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import javax.swing.JOptionPane;

/**
 *
 * @author HITMA
 */
public class Array5 {

    public static void main(String[] args) {
        char arrayLetras[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++) {
            arrayLetras[j] = (char) i;
        }
        String cadena = "";
        int eleccion = -1;
        do {
            eleccion = Integer.parseInt(JOptionPane.showInputDialog(null, "Elija un indice entre 0 y " + (arrayLetras.length - 1)));
            if (!(eleccion >= 0 && eleccion <= arrayLetras.length - 1)) {
                JOptionPane.showMessageDialog(null, "Error, inserte otro numero");
            } else {
                if (eleccion != -1) {
                    cadena += arrayLetras[eleccion];
                }
            }
        } while (eleccion != -1);
        System.out.println(cadena);
    }
}
