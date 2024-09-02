/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;
import java.util.Scanner;
        
public class TrianguloRectangulo {

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
            for(int i=1; i<= altura; i++)
            {
                for(int j=1;j<=i; j++)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
        
        }
    }
    
}
