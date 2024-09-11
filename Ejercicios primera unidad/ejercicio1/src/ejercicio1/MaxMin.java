
package ejercicio1;
import java.util.Scanner;

public class MaxMin {

    
    public static void main(String[] args) {
        Scanner ingresado= new Scanner(System.in);
        int numero;
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        int suma=0;
        double promedio;
        
        for(int i=1; i<=5; i++)
        {
            System.out.println("Ingrese el "+ i +"° numero");
            numero= ingresado.nextInt();
            if(numero<min)
            {
                min=numero;
            }
            if(numero>max)
            {
                max=numero;
            }
            suma+=numero;       
            
        }
        promedio=(double)suma/5;
        System.out.println("El numero max es "+ max);
        System.out.println("El numero min es "+min);
        System.out.println("El promedio es "+promedio);
        }
    }
    

