/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;
import java.util.InputMismatchException; //Importo esta excepcion que se aplica al ingresp del scanner.
import java.util.Scanner;

public class NumeroCentro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean bandera= true;
        Scanner ingresar= new Scanner(System.in);
        int num;
        
        System.out.println("Ingrese numero");
        
        while(bandera){
            try{    
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
                        if(sumder==sumizq && sumder>3)
                        {
                            System.out.println(i + " es numero centro");
                        }
                    }
                    bandera=false;
                }
                else{ 
                    System.out.println("Ingrse un numero mayor o igual a dos");
                }
            }catch(InputMismatchException e)
            {
                System.out.println("Ingrse numero, no otro tipo de caracteres: ");
                ingresar.next();
            }
        }
        ingresar.close();
    }    
}
