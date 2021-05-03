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
public class Basic3 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog(null, " inghresa tu nombre ");
        JOptionPane.showMessageDialog(null, "HOLA " +(name)+ " BIENVENIDO espero tu estancia sea agradable." );
        
    }
    
}
