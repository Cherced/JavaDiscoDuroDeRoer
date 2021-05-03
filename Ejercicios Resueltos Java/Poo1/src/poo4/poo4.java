/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo4;

/**
 *
 * @author HITMA
 */
public class poo4 {

    public static void main(String[] args) {
        // creamos un array para guardar los electrodomesticos:
        Electrodomestico listaElectrodomesticos[] = new Electrodomestico[10];
        //creamos objetos en cada posicion:
        listaElectrodomesticos[0] = new Electrodomestico(200, "VERDE", 'a', 60);
        listaElectrodomesticos[1] = new Lavadora(150, 30);
        listaElectrodomesticos[2] = new Televisor(500, "Negro", 'b', 80, 42, false);
        listaElectrodomesticos[3] = new Electrodomestico();
        listaElectrodomesticos[4] = new Electrodomestico(600, "lila", 'D', 500);
        listaElectrodomesticos[5] = new Lavadora(300, "blanco", 'Z', 40, 40);
        listaElectrodomesticos[6] = new Televisor(250, 70);
        listaElectrodomesticos[7] = new Lavadora(400, "verde", 'A', 100, 15);
        listaElectrodomesticos[8] = new Televisor(200, "naranja", 'C', 60, 30, true);
        listaElectrodomesticos[9] = new Electrodomestico(50, 10);
        //creamos variables para almacenar la suma de cada objeto:
        double sumaElectrodomesticos = 0;
        double sumaTelevisores = 0;
        double sumaLavadoras = 0;

        //recorremos el arreglo invocando el metodo precio final:
        for (int i = 0; i < listaElectrodomesticos.length; i++) {
            /*
             * Cuando una Television o una Lavadora este en la posicion del array actual,
             * pasara por su clase y por la de electrodomestico, ya que una television es un electrodomestico.
             * Ejecutamos en cada uno su propia version del metodo precioFinal
             */
            if (listaElectrodomesticos[i] instanceof Electrodomestico) {
                sumaElectrodomesticos += listaElectrodomesticos[i].precioFinal();
            }
            if (listaElectrodomesticos[i] instanceof Lavadora) {
                sumaLavadoras += listaElectrodomesticos[i].precioFinal();
            }
            if (listaElectrodomesticos[i] instanceof Televisor) {
                sumaTelevisores += listaElectrodomesticos[i].precioFinal();
            }
        }
        //Mostramos los resultados
        System.out.println("La suma del precio de los electrodomesticos es de " + sumaElectrodomesticos);
        System.out.println("La suma del precio de las lavadoras es de " + sumaLavadoras);
        System.out.println("La suma del precio de las televisiones es de " + sumaTelevisores);
    }
}
