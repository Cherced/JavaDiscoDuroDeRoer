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
public class Espectador {

    //atributos:
    private String nombre;
    private int edad;
    private double dinero;

    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public void pagar(double precio) {
        dinero -= precio;
    }

    public boolean tieneEdad(int edadMinima) {
        return edad >= edadMinima;
    }
    
    public boolean tieneDinero (double precioentrada){
        return dinero >= precioentrada;
    }

    @Override
    public String toString() {
        return " El espectador " + " con el nombre=" + nombre + ", de edad :" + edad + ",Tiene dinero=" + dinero + "dinero en sus bolsillos";
    }

}
