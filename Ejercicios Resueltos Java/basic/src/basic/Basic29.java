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
public class Basic29 {
    public static void main(String[] args) {
        String text = JOptionPane.showInputDialog(null, " ingresa tu frase! ");
        String palabra[] = text.split(" ");
        for (int i = 0; i <palabra.length; i++) {
            System.out.println(palabra[i]);
        }
    }
}
