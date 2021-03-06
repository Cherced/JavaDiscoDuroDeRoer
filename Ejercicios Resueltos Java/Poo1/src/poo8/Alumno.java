/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo8;

/**
 *
 * @author HITMA
 */
public class Alumno extends Persona {

    /*Atributos*/
    private int nota;

    /*Constructor*/
    public Alumno() {
        super();

        nota = MetodosSueltos.generaNumeroAleatorio(0, 10);

        super.setEdad(MetodosSueltos.generaNumeroAleatorio(12, 15));

    }

    /*Metodos*/
    /**
     * Devuelve la nota
     *
     * @return nota del alumno
     */
    public int getNota() {
        return nota;
    }

    /**
     * Modifica la nota del alumno
     *
     * @param nota
     */
    public void setNota(int nota) {
        this.nota = nota;
    }

    /**
     * Indica si el alumno esta disponible (50%)
     */
    @Override
    public void disponibilidad() {

        int prob = MetodosSueltos.generaNumeroAleatorio(0, 100);

        if (prob < 50) {
            super.setAsistencia(false);
        } else {
            super.setAsistencia(true);
        }

    }

    /**
     * Muestra la informacion del alumno
     *
     * @return informacion
     */
    @Override
    public String toString() {

        return "Nombre: " + super.getNombre() + " ,sexo: " + super.getSexo() + " , nota: " + nota;

    }

}
