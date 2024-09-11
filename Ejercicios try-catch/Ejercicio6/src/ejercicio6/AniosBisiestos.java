/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio6;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Ivan
 */
public class AniosBisiestos{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bandera=true;
        Scanner ingresado= new Scanner(System.in);
        int anioInicial;
        int anioFin;
        
        while(bandera){
            try{        
                System.out.println("Ingrese año de inicio");
                anioInicial= ingresado.nextInt();
                System.out.println("Ingrese año final");
                anioFin= ingresado.nextInt();
                for(int i= anioInicial;i<=anioFin; i++)
                {
                if(i%4==0 && i%100!=0 || i%400==0)
                {
                    System.out.println(i + " es año bisiesto");
                }
                bandera=false;
            }
            }catch(InputMismatchException e)
            {
                System.out.println("Error al ingresar años. Revise el tipo de caracteres:" );
                ingresado.next();
            }
        }
        ingresado.close();
    }
}
