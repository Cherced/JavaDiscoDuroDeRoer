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
public class Methods6 {

    public static int cuentaCifras(int numero) {
        int contador = 0;
        for (int i = numero; i > 0; i /= 10) {
            //Incrementamos el contador
            contador++;
        }
        return contador;
    }

    public static void main(String[] args) {
        boolean finish = false;
        int num = 0;
        int newNum = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero a revisar:"));
            if (num > 0) {
                int numCifras = cuentaCifras(num);
                if (numCifras == 1) {
                    System.out.println("El numero " + num+ " tiene " + numCifras + " cifra");
                } else {
                    System.out.println("El numero " + num + " tiene " + numCifras + " cifras");
                }
                int option = JOptionPane.showConfirmDialog(null, "desea terminar el programa");
                if (option != 1) {
                    finish = true;
                } else {
                    finish = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "el numero ingresado debe ser psotivo mayor que 0");
                finish = false;
            }
        } while (!finish);

    }
}
