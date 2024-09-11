
package ejercicio1;
import java.util.Scanner;
import java.util.InputMismatchException;

public class MaxMin {

    
    public static void main(String[] args) {
        Scanner ingresado= new Scanner(System.in);
        int numero;
        int min= Integer.MAX_VALUE;
        int max= Integer.MIN_VALUE;
        int suma=0;
        double promedio;
        int contador=1;
        
         try {
            while (contador<=5) {
                System.out.println("Ingrese el " + contador + "° numero");
                numero = ingresado.nextInt();
                if (numero < min) {
                    min = numero;
                }
                if (numero > max) {
                    max = numero;
                    contador++;
                }
                suma += numero;
            }
            promedio = (double) suma / 5;
            System.out.println("El numero max es " + max);
            System.out.println("El numero min es " + min);
            System.out.println("El promedio es " + promedio);
        } catch (InputMismatchException e) {
            System.out.println("Ingrese numeros, no otro tipo de caracteres");
            ingresado.next();
        }
        ingresado.close();
    }
}

