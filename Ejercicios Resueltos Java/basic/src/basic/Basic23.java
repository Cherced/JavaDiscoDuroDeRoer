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
public class Basic23 {

    public static void main(String[] args) {
        boolean finish = false;
        int total = 0;
        do {
            int num = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese numeros"));
            if (num != -1) {
                total += num;
                finish = false;
            } else {
                System.out.println(total);
                finish = true;
            }
        } while (!finish);
    }
}
