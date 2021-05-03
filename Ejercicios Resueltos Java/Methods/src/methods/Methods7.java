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
public class Methods7 {

    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Escribe una cantidad en euros");
        double cantidad = Double.parseDouble(texto);
        String moneda = JOptionPane.showInputDialog("Escribe la moneda a la que quieres convertir");
        conversor(cantidad, moneda);
    }

    public static void conversor(double cantidad, String moneda) {
        double res = 0;

        //Este booleano lo utilizo en caso de que alguien, no introduzca un nombre de moneda correcto
        boolean correcto = true;

        //Segun la moneda, calculamos la cantidad
        switch (moneda) {
            case "libras":
                res = cantidad * 0.86;
                break;
            case "dolares":
                res = cantidad * 1.29;
                break;
            case "yenes":
                res = cantidad * 129.852;
                break;
            default:
                System.out.println("No has introducido una moneda correcta");
                correcto = false;
        }

        //Solo si es correcto muestra el mensaje
        if (correcto) {
            System.out.println(cantidad + " euros en " + moneda + " son " + res);
        }
    }
}
