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
public class Basic14 {

    public static void main(String[] args) {
        boolean finish = false;
        int dayNum = 0;
        
        do {
            
            String day = JOptionPane.showInputDialog(null, "Ingrese el dia a consultar: ");
        if (null == day) {
            dayNum = 8;
        } else switch (day) {
                case "Lunes":
                case "lunes":
                    dayNum = 1;
                    break;
                case "Martes":
                case "martes":
                    dayNum = 2;
                    break;
                case "Miercoles":
                case "miercoles":
                    dayNum = 3;
                    break;
                case "Jueves":
                case "jueves":
                    dayNum = 4;
                    break;
                case "Viernes":
                case "viernes":
                    dayNum = 5;
                    break;
                case "Sabado":
                case "sabado":
                    dayNum = 6;
                    break;
                case "Domingo":
                case "domingo":
                    dayNum = 7;
                    break;
                default:
                    dayNum = 8;
                    break;
            }
            switch (dayNum) {

                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    JOptionPane.showMessageDialog(null, "Es un dia laboral");
                    break;
                case 6:
                case 7:
                    JOptionPane.showMessageDialog(null, "No es un dia laboral");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "lo ingresado no corresponde a uin dia de la semana intente nuevamente");
                    finish = false;
                    break;
            }
            if (dayNum <=7 && dayNum >=1) {
                int yes = JOptionPane.showConfirmDialog(null, " ¿Desea revisar otro dia? ");
                finish = yes == 1;
            }
        } while (!finish);
    }
}
