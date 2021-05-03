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
public class Methods1 {

    public static void areaCirculo(double radio) {
        double areaCirculo = (Math.pow(radio, 2)) * Math.PI;
        JOptionPane.showMessageDialog(null, "El area de su Circulo es de = " + areaCirculo);
    }

    public static void areaTriangulo(double base, double altura) {
        double areaTriangulo = (base * altura) / 2;
        JOptionPane.showMessageDialog(null, "El area de su Triangulo es de = " + areaTriangulo);
    }

    public static void areaCuadrado(double ladoA, double ladoB) {
        double areaCuadrado = ladoA * ladoB;
        JOptionPane.showMessageDialog(null, "El area de su Cuadrado es de = " + areaCuadrado);
    }

    public static void main(String[] args) {
        boolean fin = false;
        do {
            int opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Bienvenido ala calculadora de areas seleccione las siguientes opciones:\n1. Circulo\n2. Triangulo \n3. Cuadrado\n4. Salir "));
            switch (opcion) {
                case 1:
                    double radio = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese el Radio de el circulo: "));
                    areaCirculo(radio);
                    break;
                case 2:
                    double base = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese la base de su triangulo: "));
                    double altura = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese la altura de su triangulo: "));
                    areaTriangulo(base, altura);
                    break;
                case 3:
                    double ladoA = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese lado A del cuadrado: "));
                    double ladoB = Double.parseDouble(JOptionPane.showInputDialog(null, "ingrese lado B del cuadrado: "));
                    areaCuadrado(ladoA, ladoB);
                    break;
                case 4:
                    fin = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "la opcion ingresa no es valida!");
                    break;
            }
        } while (!fin);
    }
}
