/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo1;

/**
 *
 * @author HITMA
 */
public class Poo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta cliente_1 = new Cuenta ("militooo", 10000000);
        cliente_1.ingresar(1000);
        System.out.println(cliente_1);
        cliente_1.retirar(8521456);
        System.out.println(cliente_1);
        
    }
    
}
