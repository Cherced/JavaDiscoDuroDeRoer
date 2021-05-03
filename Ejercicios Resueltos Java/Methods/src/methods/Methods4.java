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
public class Methods4 {

    static boolean esPrimo(int num) {
        int cont = 0;
        if (num <= 1) {
            return false;
        }
        for (int divisor = (int) Math.sqrt(num); divisor > 1; divisor--) {
            if (num % divisor == 0) {
                cont += 1;
            }
        }
        if (cont >= 1) {
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, " ingrese el numero a verificar: "));
        if (esPrimo(num)) {
            System.out.println("El numero "+num+" es primo");
        } else {
            System.out.println("El numero "+num+" No es primo");
        }
    }

}
