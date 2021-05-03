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
public class Basic16 {

    public static void main(String[] args) {
        boolean back = false;
        int num = 0;
        int counter = 0;
        int continuee = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el dato a evaluar"));
            if (num > 0) {
                for (int i = num; i > 0; i /= 10) {
                    counter++;
                }
                JOptionPane.showMessageDialog(null, "el numero " + (num) + " tiene " + (counter) + " cifras");
                continuee = JOptionPane.showConfirmDialog(null, " desea continuar evaluando cifras");
                if (continuee == 0) {
                    back = false;
                } else {
                    back = true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "solo deposita numeros positivos");
                back = false;
            }
        } while (!back);

    }

}
