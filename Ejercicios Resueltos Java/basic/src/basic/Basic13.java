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
public class Basic13 {

    public static String password(String password) {
        int numpass = 0;
        int mayus = 0;
        int minus = 0;
        boolean passOK = false;
        do {
            password = JOptionPane.showInputDialog(null, "Ingrese su contraseña:\n NOTA: para crear su contraseña debe tener al menos 2 mayusculas y 4 numeros o simbolos, y debe tener un largo de minimo 8 caracteres.");
            if (password.length() >= 8) {
                for (int i = 0; i < password.length(); i++) {
                    if (password.charAt(i) <= 90 && password.charAt(i) >= 65) {
                        mayus++;
                    } else if (password.charAt(i) <= 122 && password.charAt(i) >= 97) {
                        minus++;
                    } else {
                        numpass++;
                    }
                }
                if (numpass >= 4 && mayus >= 2) {
                    JOptionPane.showMessageDialog(null, "Felicidades!!!\nLa contraseña se guardo satisfactoriamente, pues cubre con los parametros establecidos");
                    passOK = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Error!!!\nLa contraseña es debil y no cumple con los parametros exigidos, por lo tanto no se guardo, intente de nuevo");
                    passOK = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "la contraseña es muy corta");
                passOK = false;
            }
        } while (!passOK);
        return password;
    }

    public static void main(String[] args) {
        String clave = null;
        String password = password(clave);
        boolean allOk = false;
        String unLock = JOptionPane.showInputDialog(null, "ingrese su contraseña:");
        if (password.equals(unLock)) {
            JOptionPane.showMessageDialog(null, "Bienvenido");
        } else {
            JOptionPane.showMessageDialog(null, "la cago");

        }

    }

}
