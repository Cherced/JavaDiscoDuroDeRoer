/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import javax.swing.JOptionPane;

/**
 *
 * @author HITMA
 */
public class Array10 {

    public static void inNames(String[] names, String name) {
        for (int i = 0; i < names.length; i++) {
            name = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante"+(i+1)+":");
            names[i] = name;
        }
    }

    public static void inNotes(double[] notes, double note) {
        for (int i = 0; i < notes.length; i++) {
            note = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota del estudiante"+(i+1)+":"));
            if (note <= 10 && note >= 0) {
                notes[i] = note;
            }
        }
    }
    
    public static void printStatus(double[] notes, String[] names){
        String warning = null;
        for (int i = 0; i < notes.length; i++) {
            if (notes[i] <=4.99 && notes[i]>=0) {
            warning = "Suspenso";
            } else if (notes[i] <=6.99 && notes[i]>=5) {
               warning = "Bien"; 
            } else if (notes[i] <=8.99 && notes[i]>=6){
                warning = "Notable"; 
            }else if (notes[i] <=10 && notes[i]>=9){
                warning = "Sobresaliente"; 
            }
            System.out.println("El estudiante "+names[i]+" tiene una nota de: "+notes[i]+ "su estatus es: "+warning );
        }
    }

    public static void main(String[] args) {
        int tamaño = 4;
        double notes[] = new double[tamaño];
        double note = 0;
        String names[] = new String[notes.length];
        String name = null;
        inNames(names, name);
        inNotes(notes, note);
        printStatus(notes, names);
        

    }
}
