/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio2;
import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class PotenciaCubo{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingresado= new Scanner(System.in);
        int numero;        
        double cuadrado;
        double cubo;
        System.out.println("Ingrese numero");
        numero= ingresado.nextInt();
        if (numero>=0)
        {
            cuadrado= Math.pow(numero, 2);
            cubo= Math.pow(numero, 3);
            System.out.println("Cuadrado : " + cuadrado);
            System.out.println("Cubo : "+ cubo);
            
        }
        else
        {
            System.out.println("ERROR. Numero menor o igual a cero");
        }
        }
            
        }
    
    

