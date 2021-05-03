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
public class Basic20 {

    public static void main(String[] args) {
        String cadena="La lluvia en Sevilla es una maravilla";
 
        //Aviso, de esta forma no modifica el String original
        System.out.print(cadena.replace('a', 'e'));
    }
}
