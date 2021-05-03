/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo2;

import javax.swing.JOptionPane;

/**
 *
 * @author HITMA
 */
public class poo2 {
    public static void MuestraMensajePeso(Persona p) {
        int IMC = p.calcularIMC();
        switch (IMC) {
            case Persona.PESO_IDEAL :
                System.out.println("La persona esta en su peso ideal");
                break;
            case Persona.INFRA_PESO :
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Persona.SOBRE_PESO :
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }
 
    public static void MuestraMayorDeEdad(Persona p) {
 
        if (p.esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad");
        } else {
            System.out.println("La persona no es mayor de edad");
        }
    }

    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "ingrese la Edad:"));
        String sexoT = JOptionPane.showInputDialog(null, "Ingrese el Sexo");
        char sexo = sexoT.charAt(0);
        double peso = Double.parseDouble(JOptionPane.showInputDialog(null, " ingrese el Peso:"));
        double altura = Double.parseDouble(JOptionPane.showInputDialog(null, " ingrese el Altura:"));
//creando objetos:
        Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona(nombre, edad, sexo, peso, altura);
// asignando con set a persona 1: 
        persona1.setNombre("anggye");
        persona1.setEdad(24);
        persona1.setSexo('M');
        persona1.setPeso(106.5);
        persona1.setAltura(2.5);
        
        persona2.setPeso(90.6);
        persona2.setAltura(1.78);
        
        //Usamos metodos para realizar la misma accion para cada objeto
        System.out.println("Persona1");
        MuestraMensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        System.out.println(persona1.toString());
 
        System.out.println("Persona2");
        MuestraMensajePeso(persona2);
        MuestraMayorDeEdad(persona2);
        System.out.println(persona2.toString());
 
        System.out.println("Persona3");
        MuestraMensajePeso(persona3);
        MuestraMayorDeEdad(persona3);
        System.out.println(persona3.toString());
    }

}
