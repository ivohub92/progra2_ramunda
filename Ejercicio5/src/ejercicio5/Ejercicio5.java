/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingresar= new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese numero");
        num= ingresar.nextInt();
        if(num>=2)
        {
            for(int i=2; i<=num;i++)
            {
                int sumizq=0;
                int sumder=0;
                for (int k=1; k<i;k++)
                {
                    sumizq+=k;
                }
                for (int j=i; sumder<sumizq;j++)
                {
                    sumder+=j;
                }
                if(sumder==sumizq)
                {
                    System.out.println(i + " es numero centro");
                }
            }
        }
        else{ 
            System.out.println("Ingrse un numero mayor o igual a dos");
        }
        
    }
    
}
