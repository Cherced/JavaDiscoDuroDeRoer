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
public class Basic1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor de a"));
        double b = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el valor de b"));

        JOptionPane.showMessageDialog(null, "Al Dividir los datos ingresados  el resultado de: " + (a / b)
                + "\nAl Multiplicarlos tenemos: " + (a * b)
                + "\nAl Sumarlos el resultado es: " + (a + b)
                + "\nAl Restarlos nos da que: " + (a - b)
                + "\ny finalmente el modulo de los datos es " + (a % b)
                + "\nSi el resultado esperado no coincide con lo buscado, analize como esta ingresando los datos e intente nuevamente.. gracias :D");
    }

}
