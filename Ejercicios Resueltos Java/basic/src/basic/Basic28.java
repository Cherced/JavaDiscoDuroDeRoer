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
public class Basic28 {
     public static void main(String[] args) {
        String text = JOptionPane.showInputDialog(null,"ingrese la frase:");
        String textOutSpaces = " ";
        char selectspace = ' ';
        
         for (int i = 0; i <text.length(); i++) {
             selectspace = text.charAt(i);
             if (selectspace!=' ' ) {
                 textOutSpaces += String.valueOf(selectspace);
             }              
                         
         }
           JOptionPane.showMessageDialog(null, textOutSpaces+"La frase tiene sin espacios es ");
    }
    
}
