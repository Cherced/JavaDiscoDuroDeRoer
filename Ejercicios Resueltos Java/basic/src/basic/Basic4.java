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
public class Basic4 {
    public static void main(String[] args) {
        double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa el radio de tu circulo: "));
        JOptionPane.showMessageDialog(null,"El area de su circulo es de: " +(Math.PI * Math.pow(radio,2)));
    }
    
}
