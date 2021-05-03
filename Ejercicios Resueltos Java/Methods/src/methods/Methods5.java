/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;

import javax.print.attribute.standard.Finishings;
import javax.swing.JOptionPane;

/**
 *
 * @author HITMA
 */
public class Methods5 {

    static String conversorBinario(int num) {
        String binario = "";
        String digito;
        for (int i = num; i > 0; i /= 2) {
            if (i % 2 == 1) {
                digito = "1";
            } else {
                digito = "0";
            }
            //Se añade el digito al principio (mira la imagen del post)
            binario = digito + binario;
        }
        return binario;
    }

    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese el numero a trasnformar: "));
        String binario = conversorBinario(num);
        System.out.println("El numero " + num + " en binario es " + binario);
    }

}
