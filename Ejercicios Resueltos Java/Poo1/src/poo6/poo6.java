/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo6;

/**
 *
 * @author HITMA
 */
public class poo6 {

    public static void main(String[] args) {
        Libro libros[] = new Libro[2];
        libros[0] = new Libro("el tales", "milagro metabolico", "Juan carlos Matellana", 70);
        libros[1] = new Libro("el tales", "milagro metabolico", "Juan carlos Matellana", 70);
        for (int i = 0; i < libros.length; i++) {
            System.out.println(libros[i].toString());
        }
        
        
    }

}
