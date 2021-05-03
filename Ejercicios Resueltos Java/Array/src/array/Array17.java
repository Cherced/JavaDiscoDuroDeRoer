/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

/**
 *
 * @author HITMA
 */
public class Array17 {

    public static void ordenarNumeros(int numbers[], int izq, int der) {
        int i = izq;
        int j = der;
        int pivote = numbers[(i + j) / 2];
        do {
            while (numbers[i] < pivote) {i++;}while (numbers[j] > pivote) {j--;}
            if (i <= j) {
                int aux = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = aux;
                i++;
                j--;
            }
        } while (i <= j);
        //llamada de funciones (recursivo)
        if (izq < j) {
            ordenarNumeros(numbers, izq, j);
        }
        if (i < der) {
            ordenarNumeros(numbers, i, der);
        }

    }

    public static void main(String[] args) {
        //array a ordenar
        int numbers[] = {5, 6, 2, 10, 1};
        ordenarNumeros(numbers, 0, numbers.length-1);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

    }

   /* public static void main(String[] args) {
 
        //array a ordenar
        int numeros[]={5,6,2,10,1};
         
        //llamada funcion
        ordenacionQuicksort(numeros, 0, numeros.length-1);
         
        //mostramos el contenido
        for(int i=0;i<numeros.length;i++){
            System.out.println(numeros[i]);
        }
         
    }
     
    /**
     * Ordena un array por el metodo de ordenacion QuickSort
     * @param array
     * @param izq
     * @param der 
     */
    /*public static void ordenacionQuicksort (int array[], int izq, int der){
        int i=izq;
        int j=der;
        int pivote=array[(i+j)/2]; //determinamos el pivote
        do {
            while (array[i]<pivote){ i++; } while (array[j]>pivote){
                j--;
            }
            if (i<=j){
                //intercambio
                int aux=array[i];
                array[i]=array[j];
                array[j]=aux;
                i++;
                j--;
            }
        }while(i<=j);
        //llamada de funciones (recursivo)
        if (izq<j){
            ordenacionQuicksort(array, izq, j);
        }
        if (i<der){
            ordenacionQuicksort(array, i, der);
        }
    }
     */
}
