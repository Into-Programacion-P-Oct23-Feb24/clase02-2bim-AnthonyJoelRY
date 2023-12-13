/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java

        // arreglo de tipo entero
        int[] arreglo1 = new int[5];//En el arreglo uno declaramos el tipo y el 
        // numero de elemementos en una sola linea.
        
        // arreglo de tipo entero
        int[] arreglo2;// En el arreglo dos declaramos el tipo de elementos y 
        //el tipo de valor que va tomar el mismo por separado.
        arreglo2 = new int[5];
        
        // arreglo de tipo entero
        int[] arreglo3 = {5, 10, 15, 20, 25}; // sin new
        
        // arreglo de doubles - 3 elementos
        double[] arreglo4 = {5.1, 10.2, 15.2}; // sin new
        
        // arreglo de cadenas - 4 elementos
        String[] arreglo5 = {"Loja", "Quito", "Zamora", "Machala"};
    }

}
