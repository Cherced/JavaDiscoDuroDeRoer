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
public class Basic26 {

    public static void main(String[] args) {
        boolean finish = false;
        final int DIFERENCIA = 32;
        boolean isMayus;
        String cadenaresultante = "";
        do {
            String text = JOptionPane.showInputDialog(null, "Ingrese el texto a transformar");
            String[] opciones = {"Mayusculas", "Minusculas"};
            int eleccion = JOptionPane.showOptionDialog(null,
                    "Elige tu opcion",
                    "Eleccion",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]);
            isMayus = (eleccion == JOptionPane.YES_OPTION);
            char caracteractual;
            for (int i = 0; i < text.length(); i++) {
                caracteractual = text.charAt(i);
                if (isMayus) {
                    if (caracteractual >= 97 && caracteractual <= 122) {
                        cadenaresultante += (char) (caracteractual - DIFERENCIA);
                    } else {
                        cadenaresultante += caracteractual;
                    }
                } else {
                    if (caracteractual >= 65 && caracteractual <= 90) {
                        cadenaresultante += (char) (caracteractual + DIFERENCIA);
                    } else {
                        cadenaresultante += caracteractual;
                    }
                }
            }
            JOptionPane.showMessageDialog(null,
                    cadenaresultante,
                    "Resultado",
                    JOptionPane.INFORMATION_MESSAGE);

            int finish1 = JOptionPane.showConfirmDialog(null, "Desea continuar el programa ?");
            finish = finish1 == 1;
        } while (!finish);
    }
}
