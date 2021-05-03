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
public class Basic11 {

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "¡Bienvenido a la calculadora de grado 2!\n "
                + "Tenga en cuenta que los valores de x en cada una de las expreciones deben ir multiplicados, es decir 2x, multiplique por el valor de x e ingreselo para la ecuacion... GRACIAS");
        double a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de A: "));
        double b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de B: "));
        double c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de C: "));
        double resultado = 0;
        boolean continuarMenuG = false;
        boolean controlSubMenu = false;

        do {
            int numdiscriminante = Integer.parseInt(JOptionPane.showInputDialog(null,
                    "Cuantos discriminantes desea en su ecuacion: \n RECUERDESon ecuaciones de segundo grado aquellas en las que la incógnita aparece al menos una vez elevada al cuadrado (x2). Por ejemplo: 3x^2 - 3x = x - 1. \n \n1. para solo afectar una variable\n2. para solo afectar dos variables\n3. para afectarlas a todas\n4. Salir"));
            switch (numdiscriminante) {
                case 1:
                    do {
                        int logA = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Seleccione la opcion para afectar a Raiz cuadrada, o la potencia 2 \n 1. para potencia\n 2. para raiz\n 3. para retornar al menu anterior"));
                        switch (logA) {
                            case 1:
                                int select1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la variable a afectar:\n1.A\n2.B\n3.C"));
                                switch (select1) {
                                    case 1:
                                        resultado = Math.pow(a, 2) + b + c;
                                        JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
                                        break;
                                    case 2:
                                        resultado = a + Math.pow(b, 2) + c;
                                        JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
                                        break;
                                    case 3:
                                        resultado = a + b + Math.pow(c, 2);
                                        JOptionPane.showMessageDialog(null, "El resultado es " + resultado);
                                        break;
                                    default:
                                        JOptionPane.showMessageDialog(null, "La opcion ingresada es invalida, intente nuevamente");
                                        break;
                                }
                                controlSubMenu = false;
                                break;
                            case 2:
                                int select2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la variable a afectar:\n1.A\n2.B\n3.C"));
                                controlSubMenu = false;
                                break;
                            case 3:
                                controlSubMenu = true;
                                break;
                            default:
                                JOptionPane.showMessageDialog(null, "La opcion ingresada es invalida, intente nuevamente");
                                controlSubMenu = false;
                                break;
                        }
                    } while (!controlSubMenu);
                    continuarMenuG = false;
                    break;
                case 2:
                    int logB = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la opcion para afectar a Raiz cuadrada, o a potencia 2 \n 1. para potencia\n 2. para raiz\n 3. para ambas en la ecuacion"));
                    switch (logB) {
                        case 1:
                            int asignacion21 = Integer.parseInt(JOptionPane.showInputDialog(null, "seleccione donde afectar la potencia: \n1.A\n2.B\n3.C"));
                            break;
                        case 2:
                            int asignacion22 = Integer.parseInt(JOptionPane.showInputDialog(null, "seleccione donde afectar la Raiz: \n1.A\n2.B\n3.C"));
                            break;
                        case 3:
                            int asignacion231 = Integer.parseInt(JOptionPane.showInputDialog(null, "seleccione donde afectar la potencia: \n1.A\n2.B\n3.C"));
                            int asignacion232 = Integer.parseInt(JOptionPane.showInputDialog(null, "seleccione donde afectar la Raiz: \n1.A\n2.B\n3.C"));

                            break;
                    }
                    break;
                case 3:
                    int logC = Integer.parseInt(JOptionPane.showInputDialog(null, "Seleccione la opcion para afectar a Raiz cuadrada, o a potencia 2 \n 1. para potencia\n 2. para raiz"));
                    switch (logC) {
                        case 1:
                            break;
                        case 2:
                            break;
                    }

                    break;
                case 4:
                    continuarMenuG = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "La opcion ingresada es invalida, intente nuevamente");
                    continuarMenuG = false;
                    break;

            }

        } while (!continuarMenuG);

    }
}
