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
public class Basic15 {

    public static void main(String[] args) {
        int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el punto de partida"));
        int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el punto de llegada"));
        int num =0;
        for (int i = 0; i < 10; i++) {
           num = (int) Math.floor(Math.random()* (a-b) +b);
            System.out.println(num);
        }

    }

}
