/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo9;

/**
 *
 * @author HITMA
 */
public class Asiento {

    //atributos:
    private char letra;
    private int fila;
    private Espectador espectador; // puedo tener variables objeto, y este sera null para constructor si este esta vacio. 

    //constructor con parametro null por vacio:
    public Asiento(char letra, int fila) {
        this.letra = letra;
        this.fila = fila;
        this.espectador = null; //al cargarse el asiento no abra nadie alli
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    // comportamiento del asiento:
    // verificar si esta ocupado:
    public boolean ocupado() {
        return espectador != null;
    }
    // en el tostring dar dos retronos, uno con datos de cliente, otro de asiento vacio:

    @Override
    public String toString() {
        if (ocupado()) {
            return "asiento: " + fila + letra + "y" + espectador;
        }
        return "asiento: " + fila + letra + " Este asiento esta vacio ";
    }

}
