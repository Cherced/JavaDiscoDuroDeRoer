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
public class Televisor extends Electrodomestico {

    //constentes:
    private final static double RESOLUCION_PULGADAS_DEF = 20;
    private final static boolean SINTONIZADOR_TDT_DEF = false;
    // atributos:
    private double resolucionPulgadas;
    private boolean sintonizadorTDT;

    //constructor por defecto:
    public Televisor() {
        this(PRECIO_BASE_DEF, COLOR_DEF, CONSUMO_ENERGETICO_DEF, PESO_DEF, RESOLUCION_PULGADAS_DEF, SINTONIZADOR_TDT_DEF);
    }
    // constructores:

    public Televisor(double resolucionPulgadas, boolean sintonizadorTDT) {
        this.resolucionPulgadas = resolucionPulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    public Televisor(double precioBase, double peso) {
        this(precioBase, COLOR_DEF, CONSUMO_ENERGETICO_DEF, peso, RESOLUCION_PULGADAS_DEF, SINTONIZADOR_TDT_DEF);

    }

    /**
     *
     * @param precioBase
     * @param color
     * @param consumoEnergetico
     * @param peso
     * @param resolucionPulgadas
     * @param sintonizadorTDT
     */
    public Televisor(double precioBase, String color, char consumoEnergetico, double peso, double resolucionPulgadas, boolean sintonizadorTDT) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucionPulgadas = resolucionPulgadas;
        this.sintonizadorTDT = sintonizadorTDT;
    }

    //getters y setters:
    public double getResolucionPulgadas() {
        return resolucionPulgadas;
    }

    public void setResolucionPulgadas(double resolucionPulgadas) {
        this.resolucionPulgadas = resolucionPulgadas;
    }

    public boolean isSintonizadorTDT() {
        return sintonizadorTDT;
    }

    public void setSintonizadorTDT(boolean sintonizadorTDT) {
        this.sintonizadorTDT = sintonizadorTDT;
    }

    /*precioFinal(): si tiene una resolución mayor de 40 pulgadas, se incrementara el precio un 30% y si tiene un sintonizador TDT incorporado,
    aumentara 50 €.Recuerda que las condiciones que hemos visto en la clase Electrodomestico también deben afectar al precio.*/
    @Override
    public double precioFinal() {
        //invocamos el metodo de la clase padre o superclase:
        double plus = super.precioFinal();
        if (resolucionPulgadas > 40) {
            plus += precioBase * 0.3;
        }
        if (sintonizadorTDT) {
            plus += 50;
        }
        return plus;
    }
}
