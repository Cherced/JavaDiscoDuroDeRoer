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
public class Basic6 {

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el codigo ASCII:"));
        JOptionPane.showMessageDialog(null, ((char) a) + "El Codigo ingresado equvale a " + " en ASCII");

    }

}
