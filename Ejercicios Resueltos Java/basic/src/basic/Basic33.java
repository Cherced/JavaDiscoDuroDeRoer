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
public class Basic33 {

    public static void main(String[] args) {
        int mayor = 0;
        int menor = 0;
        int sumaTotal = 0;
        int sumaPositiva = 0;
        int sumaNegativa = 0;
        double mediaSuma = 0;
        int contador = -1;
        int num = 0;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese los numeros que desea calcular, cuando ingrese un -1 el programa se detendra, y tendra las operaciones resultantes :"));
            contador++;
            if (menor > num) {
                menor = num;
            }
            if (mayor < num) {
                mayor = num;
            }
            sumaTotal += num;

            if (num > 0) {
                sumaPositiva += num;
            } else {
                sumaNegativa += num;
            }

        } while (num != -1);
        mediaSuma = (double) sumaTotal / contador;
        System.out.println("El menor es: " + menor);
        System.out.println("El mayor es: " + mayor);
        System.out.println("La suma es: " + sumaTotal);
        System.out.println("La suma de los positivos es: " + sumaPositiva);
        System.out.println("La suma de los negativos es: " + sumaNegativa);
        System.out.println("La media es: " + mediaSuma);
    }
}
