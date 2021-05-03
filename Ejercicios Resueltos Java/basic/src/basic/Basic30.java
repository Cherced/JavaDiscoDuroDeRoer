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
public class Basic30 {

    public enum DiasSemana {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO;
    }

    public static void main(String[] args) {
        String dia = JOptionPane.showInputDialog(null, "Ingresa el dia de la semana:");
        DiasSemana diaS = DiasSemana.valueOf(dia.toUpperCase());
        switch (diaS) {
            case LUNES:
            case MARTES:
            case MIERCOLES:
            case JUEVES:
            case VIERNES:
                System.out.println("El dia " + diaS.name().toLowerCase() + " es laborable");
                break;
            case SABADO:
            case DOMINGO:
                System.out.println("El dia " + diaS + " no es laborable");
                break;
        }
    }
}
