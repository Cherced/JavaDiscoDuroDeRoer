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
public class Basic31 {

    public enum DiasSemanaa {
        LUNES(true),
        MARTES(true),
        MIERCOLES(true),
        JUEVES(true),
        VIERNES(true),
        SABADO(false),
        DOMINGO(false);

        private boolean laborable;

        private DiasSemanaa(boolean laborable) {
            this.laborable = laborable;
        }

        @Override
        public String toString() {
            if (laborable) {
                return "El dia " + this.name().toLowerCase() + " es laborable";
            } else {
                return "El dia " + this.name().toLowerCase() + " no es laborable";
            }
        }
    }

    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog(null, "Ingresa el dia de la semana:");
        DiasSemanaa diaS;
        diaS = DiasSemanaa.valueOf(dia.toUpperCase());
        System.out.println(diaS.toString());
    }
}
