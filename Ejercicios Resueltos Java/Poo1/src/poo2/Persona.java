/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

/**
 *
 * @author HITMA
 */
public class Persona {
//atributos persona

    private String nombre;
    private int edad;
    private String dni = null;
    private char sexo;
    private static char SEXO_DEF = 'H';
    private double peso;
    private double altura;
    //atributos IMC valor menor que 20:
    static final int PESO_IDEAL = -1;
    //atributos IMC valor entre 25 y 25:
    static final int INFRA_PESO = 0;
    //atributos IMC valor entre 25 y 25:
    static final int SOBRE_PESO = 1;

//constructor por defecto 
    public Persona() {
        this("", 0, SEXO_DEF, 0, 0);
    }

    /**
     * Constructor con 3 parametroe
     *
     * @param nombre de la persona
     * @param edad de la persona
     * @param sexo de la persona
     */
    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }

//constructor     
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public static char getSEXO_DEF() {
        return SEXO_DEF;
    }

    public static void setSEXO_DEF(char SEXO_DEF) {
        Persona.SEXO_DEF = SEXO_DEF;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int calcularIMC() {
        double IMC;
        IMC = peso / Math.pow(altura, 2);
        if (IMC < 20) {
            return PESO_IDEAL;
        } else if (IMC >= 20 && IMC <= 25) {
            return INFRA_PESO;
        } else {
            return SOBRE_PESO;
        }
    }

    public boolean esMayorDeEdad() {
        if (edad < 18) {
            return false;
        } else {
            return true;
        }
    }

    public void comprobarSexo(char sexo) {
        if ((sexo != 'H' || sexo != 'h') && (sexo != 'M' || sexo != 'm')) {
            this.sexo = SEXO_DEF;
        }
    }

    @Override
    public String toString() {
        String sexo = null;
        if ((this.sexo == 'H' || this.sexo == 'h')) {
            sexo = "HOMBRE";
        } else if (this.sexo == 'M' || this.sexo == 'm') {
            sexo = "MUJER";
        }

        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }

}
