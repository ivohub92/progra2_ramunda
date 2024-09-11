/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingresado= new Scanner(System.in);
        int numero;
        System.out.println("Ingrese numero");
        numero= ingresado.nextInt();
        if (numero <2)
        {
            System.out.println("Ingrese numero mayor a dos");
        }
        else
        {
            boolean esPrimo= true;
            for(int i=2;i<=numero;i++)
            {
                if (numero %i ==0)
                {
                    esPrimo= false;
                    break;
                }                
            }
            if(esPrimo)
            {
                System.out.println(numero +" es primo");
            }else
            {
                System.out.println(numero +" no es primo");
            }
        }
    }
}

    

