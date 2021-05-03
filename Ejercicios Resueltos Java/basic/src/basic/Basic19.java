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
public class Basic19 {

    public static void main(String[] args) {
        boolean finish = false;
        int vocal = 0;
        do {
            String text = JOptionPane.showInputDialog(null, "Ingrese el texto a evaluar");
            for (int i = 0; i < text.length(); i++) {
                if ((text.charAt(i) == 97 || text.charAt(i) == 101 || text.charAt(i) == 105 || text.charAt(i) == 111 || text.charAt(i) == 117) || (text.charAt(i) == 65 || text.charAt(i) == 69 || text.charAt(i) == 73 || text.charAt(i) == 79 || text.charAt(i) == 85)) {
                    vocal++;
                }
            }
            System.out.println("tiene " + (vocal) + " vocales");

            int yes = JOptionPane.showConfirmDialog(null, "Deseas terminar de usar el programa");
            finish = yes == 0;

        } while (!finish);
    }
}
