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
public class Basic25 {

    public static void main(String[] args) {
        boolean finish = false;
        String contenc = "";
        do {
            String text = JOptionPane.showInputDialog(null, "ingrese texto, para finalizar ingrese una cadena vacia");
            

            if (!text.isEmpty()) {
                contenc += text;
                finish = false;
            } else {
                System.out.println(contenc);
                finish = true;
            }
        } while (!finish);

    }

}
