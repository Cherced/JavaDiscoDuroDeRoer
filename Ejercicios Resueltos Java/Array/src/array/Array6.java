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
public class Array6 {
    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog(null,"Ingrese una frase");
        char caracteres[]= new char [frase.length()];
        for (int i = 0; i < frase.length(); i++) {
            caracteres[i]=frase.charAt(i);
        }
        for (int i = 0; i < caracteres.length; i++) {
                System.out.println(caracteres[i]);
        }
        
    }
    
}
