/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class Ejemplo041 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declarar y generar arreglos en Java
        Scanner entrada = new Scanner(System.in);
        String a = "";
        int suma = 0;
        // arreglo de tipo entero
        //int[] arreglo1 = new int[5];
        int[] arreglo1 = {1000, 1, 2, 2000, 300};
        // System.out.println(arreglo1.length);
        //arreglo1[2] = 1000;
        for (int i = 0; i < arreglo1.length; i++) {//la palabra length cuando 
            //lo agrego tiene como caracteristica darme el numero de elementos 
            //que tiene ese arreglo.
            suma = suma + arreglo1[i];
            a = String.format("%sSubíndice o Índice %d, con valor %d\n",
                    a, i, arreglo1[i]);

        }
        
        a = String.format("%sLa suma total es: %s",a,suma);
        a = a.toUpperCase();
        System.out.printf("%s\n",a);

    }

}
