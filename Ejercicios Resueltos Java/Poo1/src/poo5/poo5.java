/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo5;

/**
 *
 * @author HITMA
 */
public class poo5 {

    public static void main(String[] args) {

        //Creamos dos arrays de cada tipo de objeto
        Serie listaSeries[] = new Serie[5];
        VideoJuegos listaVideojuegos[] = new VideoJuegos[5];

        //Creamos un objeto en cada posicion del array
        listaSeries[0] = new Serie();
        listaSeries[1] = new Serie("Juego de tronos", "George R. R. Martin ");
        listaSeries[2] = new Serie("Los Simpsons", 25, "Humor", "Matt Groening");
        listaSeries[3] = new Serie("Padre de familia", 12, "Humor", "Seth MacFarlane");
        listaSeries[4] = new Serie("Breaking Bad", 5, "Thriller", "Vince Gilligan");

        listaVideojuegos[0] = new VideoJuegos();
        listaVideojuegos[1] = new VideoJuegos("Assasin creed 2", 30, "Aventura", "EA");
        listaVideojuegos[2] = new VideoJuegos("God of war 3", 40, "patapuño", "Santa Monica");
        listaVideojuegos[3] = new VideoJuegos("Super Mario 3DS", 30, "Plataforma", "Nintendo");
        listaVideojuegos[4] = new VideoJuegos("Final fantasy X", 200, "Rol", "Square Enix");

        //entregamos algunos videojuegos y series
        listaSeries[1].entregar();
        listaSeries[4].entregar();
        listaVideojuegos[0].entregar();
        listaVideojuegos[3].entregar();

        //Recorremos los arrays para contar cuantos entregados hay, tambien los devolvemos
        int entregados = 0;

        for (int i = 0; i < listaSeries.length; i++) {
            if (listaSeries[i].isEntregado()) {
                entregados += 1;
                listaSeries[i].devolver();

            }
            if (listaVideojuegos[i].isEntregado()) {
                entregados += 1;
                listaVideojuegos[i].devolver();
            }
        }

        System.out.println("Hay " + entregados + " articulos entregados");

        //Creamos dos objetos con la primera posicion de cada array
        Serie serieMayor = listaSeries[0];
        VideoJuegos videojuegoMayor = listaVideojuegos[0];

        //Recorremos el array desde la posicion 1 (no 0), comparando el mayor con las posiciones del array
        for (int i = 1; i < listaSeries.length; i++) {
            if (listaSeries[i].compareTo(serieMayor) == Serie.MAYOR) {
                serieMayor = listaSeries[i];
            }
            if (listaVideojuegos[i].compareTo(videojuegoMayor) == VideoJuegos.MAYOR) {
                videojuegoMayor = listaVideojuegos[i];
            }

        }

        //Mostramos toda la informacion del videojuego y serie mayor
        System.out.println(videojuegoMayor);
        System.out.println(serieMayor);

    }
}