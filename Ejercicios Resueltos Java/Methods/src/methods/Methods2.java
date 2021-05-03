/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import javax.swing.JOptionPane;

/**
 *
 * @author HITMA
 */
public class Methods2 {

    static void generadorNumerosAleatorios(int begin, int end, int size) {
        int num;
        for (int i = 0; i < size; i++) {
            num = (int) Math.floor(Math.random() * (begin - end) + end);
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int size = Integer.parseInt(JOptionPane.showInputDialog(null, " ingrese el tamaño de numeros a generar: "));
        int begin = Integer.parseInt(JOptionPane.showInputDialog(null, " ingrese el limite incial :"));
        int end = Integer.parseInt(JOptionPane.showInputDialog(null, " ingrese el limite final :"));
        generadorNumerosAleatorios(begin, end, size);
    }

}
