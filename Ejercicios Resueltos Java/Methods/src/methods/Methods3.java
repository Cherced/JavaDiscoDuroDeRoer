/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import javax.swing.JOptionPane;

/**
 *
 * @author HITMA
 */
public class Methods3 {


    static int secuenciaFactorial(int size) {
        int factor = size;
        for (int i = (size-1); i >= 1; i--) {
            factor = factor*i;
        }
        return factor;
    }

    public static void main(String[] args) {
        int size = Integer.parseInt(JOptionPane.showInputDialog(null, " ingrese el tamaño del factorial "));
        int factor = secuenciaFactorial(size);
        System.out.println("el factorial de " + (size) + " es " + factor);
    }

}
