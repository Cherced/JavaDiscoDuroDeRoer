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
public class Lavadora extends Electrodomestico {

    //Constantes:
    private final static int CARGA_DEF = 5;

    //sub clase *atributos:
    private int carga;
    //constructor por defecto: 

    public Lavadora() {
        this(PRECIO_BASE_DEF, COLOR_DEF, CONSUMO_ENERGETICO_DEF, PESO_DEF, CARGA_DEF);
    }

    //constructores :
    public Lavadora(int carga) {
        this.carga = carga;
    }

    public Lavadora(double precioBase, double peso) {
        this(precioBase, COLOR_DEF, CONSUMO_ENERGETICO_DEF, peso, CARGA_DEF);
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    //getters y setters:
    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    /* hacer :precioFinal():, si tiene una carga mayor de 30 kg, aumentara el precio 50 €, 
    sino es así no se incrementara el precio.Llama al método padre y añade el código necesario. 
    Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.
     */
    @Override
    public double precioFinal() {
        //invocamos el metodo de la clase padre o superclase:
        double plus = super.precioFinal();
        //añadimos la nueva restriccion al codigo
        if (carga > 30) {
            plus += 50;
        }
        return plus;
    }

}
