/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingresado= new Scanner(System.in);
        int altura;
        System.out.println("Ingrese numero entero positivo");
        altura= ingresado.nextInt();
        
        if(altura<0)
        {
            System.out.println("Error, numero debe ser mayor a cero");
        }
        else
        {
             for (int i = 1; i <= altura; i++) {
                // Imprimo espacios en blanco 
                for (int j = 1; j <= altura - i; j++) {
                    System.out.print(" ");
                }

                // Imprimir asteriscos
                for (int k = 1; k <= (2 * i - 1); k++) {
                    System.out.print("*");
                }

                // Nueva línea después de cada fila del triángulo
                System.out.println();
            }
        }
    }  
}
