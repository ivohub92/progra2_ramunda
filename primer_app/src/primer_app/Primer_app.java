/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package primer_app;

import java.util.Scanner;

/**
 *
 * @author Ivan
 */
public class Primer_app {
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        double num1= numero.nextDouble();
        
        System.out.println("Ingrese otro numero");
        
        double num2= numero.nextDouble();
        
        double num= num1+num2;
        
        if (num>0){
            System.out.println(num+ " Es positivo");
        }
        else if(num<0){
            System.out.println(num+ " Es negativo");
        }
        else{
            System.out.println("Es cero");        
        }
        
    }
    
}
