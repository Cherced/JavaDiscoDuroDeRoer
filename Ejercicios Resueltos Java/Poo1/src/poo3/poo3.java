/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo3;

import javax.swing.JOptionPane;

/**
 *
 * @author HITMA
 */
public class poo3 {

    public static void main(String[] args) {
        // pedimos el tamaño de el array de contraseñas, y el de las contraseñas:
        int tamaño = Integer.parseInt(JOptionPane.showInputDialog(null, "introduce un tamaño para el array:"));
        Pasword listPasword[] = new Pasword[tamaño];
        int longitud = Integer.parseInt(JOptionPane.showInputDialog(null, "intruduce el tamaño de las contraseñas"));
        boolean FortalezaPasword[]=new boolean [longitud];
        // creamos el bucle para generar los objetos y mostrarlos:
        for (int i = 0; i < listPasword.length; i++) {
            listPasword[i] = new Pasword(longitud);
            FortalezaPasword[i] = listPasword[i].esFuerte();
            System.out.println(listPasword[i].getContraseña()+" "+FortalezaPasword[i]);
        }
        

    }
}
