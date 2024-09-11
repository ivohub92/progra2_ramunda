/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 *
 * @author Ivan
 */
public class NumerosPrimos {

    
    public static void main(String[] args) {
        boolean bandera=true;
        Scanner ingresado= new Scanner(System.in);
        int numero;
        System.out.println("Ingrese numero");
        numero= ingresado.nextInt();
        
        while(bandera){
            try
            {
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
                    bandera=false;
                }
            }catch(InputMismatchException e){
                System.out.println("Ingrese numeros, no letras");
                ingresado.next();
            }
        }
        ingresado.close();
    }
}

    

