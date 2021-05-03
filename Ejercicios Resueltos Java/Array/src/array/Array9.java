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
public class Array9 {

    public static char LetrasDni(int dniResult) {
        char LetrasDni[] = {'T', 'R', 'W', 'A', 'G', 'M', 'Y',
            'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
            'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };
        return LetrasDni[dniResult];
    }

    public static void main(String[] args) {
        int dni = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese su DNI: "));
        final int DIVISOR = 23;
        int dniResult = dni%DIVISOR;
        char letra = LetrasDni(dniResult);
        JOptionPane.showMessageDialog(null,"La letra asignada a su DNI es "+letra+ "\nSu DNI definitivo es: " +dni+"-"
                + letra);

    }

}
