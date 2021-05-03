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
public class Electrodomestico {

    //Constantes 
    protected final static double PRECIO_BASE_DEF = 100;
    protected final static String COLOR_DEF = "BLANCO";
    protected final static char CONSUMO_ENERGETICO_DEF = 'F';
    protected final static double PESO_DEF = 5;
    //atributos de la superclase, protected indica que pueden ser heredados
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected double peso;

    //constructores, getters stters:
    public Electrodomestico() {
        this(PRECIO_BASE_DEF, COLOR_DEF, CONSUMO_ENERGETICO_DEF, PESO_DEF);
    }

    //constructor con precio y peso, y el resto en defecto:
    public Electrodomestico(double precioBase, double peso) {
        this(precioBase, COLOR_DEF, CONSUMO_ENERGETICO_DEF, peso);
    }

    // constructor con todols los atributos:
    public Electrodomestico(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

  
    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    //comprobarConsumoEnergetico(char): comprueba que la letra es correcta, sino es correcta usara la letra por defecto. Se invocara al crear el objeto y no sera visible.
    public void comprobarConsumoEnergetico(char consumoEnergetico) {
        if ((consumoEnergetico >= 65 && consumoEnergetico <= 70) || (consumoEnergetico >= 97 && consumoEnergetico <= 102)) {
            this.consumoEnergetico = consumoEnergetico;
        } else {
            this.consumoEnergetico = CONSUMO_ENERGETICO_DEF;
        }
    }

    public void comprobarColor(String color) {
        String colores[] = {"BLANCO", "NEGRO", "ROJO", "AZUL", "GRIS"};
        boolean encontrado = false;
        for (int i = 0; i < colores.length && !encontrado; i++) {
            if (colores[i].equals(color)) {
                encontrado = true;
            }
        }
        if (encontrado) {
            this.color = color;
        } else {
            this.color = COLOR_DEF;
        }
    }

    /**
     * Precio final del electrodomestico
     *
     * @return precio final del electrodomestico
     */
    public double precioFinal() {
        double plus = 0;
        switch (consumoEnergetico) {
            case 'A':
                plus += 100;
                break;
            case 'B':
                plus += 80;
                break;
            case 'C':
                plus += 60;
                break;
            case 'D':
                plus += 50;
                break;
            case 'E':
                plus += 30;
                break;
            case 'F':
                plus += 10;
                break;
        }

        if (peso >= 0 && peso < 19) {
            plus += 10;
        } else if (peso >= 20 && peso < 49) {
            plus += 50;
        } else if (peso >= 50 && peso <= 79) {
            plus += 80;
        } else if (peso >= 80) {
            plus += 100;
        }

        return precioBase + plus;
    }

}
