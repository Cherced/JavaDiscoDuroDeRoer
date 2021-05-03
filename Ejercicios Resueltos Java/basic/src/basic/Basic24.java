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
public class Basic24 {
    public static void main(String[] args) {
        String txt = JOptionPane.showInputDialog(null, "ingrese la frase!");
        System.out.println(txt.replace(" ", ""));
    }
    
}
