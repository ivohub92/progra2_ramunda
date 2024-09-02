/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;
import java.util.Scanner;

public class ReciboSueldo {

    public static void main(String[] args) {
        Scanner ingresado= new Scanner(System.in);
        int antiguedad,cantidadHoras;
        double totalBruto, valorHora, descuentos, valorNeto;
        int cantidadEmpleados;
        double bonoAnios= 51000;
        double porcDescuentos= 0.13;
        
        System.out.println("Ingrese cantidad de empleados");
        cantidadEmpleados= ingresado.nextInt();
        
        //Limpiamos el salto de línea
        ingresado.nextLine();
        
        for(int i=0; i<cantidadEmpleados; i++){
            
            System.out.println("Ingrese nombre del empleado");
            String nombre= ingresado.nextLine();        
            System.out.println("Ingrese valor por hora de trabajo");
            valorHora= ingresado.nextInt();
            System.out.println("Ingrese años de antigüedad");
            antiguedad= ingresado.nextInt();
            System.out.println("Ingrese cantidad de horas trabajadas");
            cantidadHoras= ingresado.nextInt();
            
                        
            // Calcular total importe a cobrar en bruto
            totalBruto= valorHora * cantidadHoras + antiguedad* bonoAnios;
            // Calcular descuentos
            descuentos= porcDescuentos *totalBruto;
            // Calcular neto
            valorNeto= totalBruto - descuentos;
            //Imprimir ticket
            
            System.out.println("Imprimir recibo \n");
            System.out.println("Antiguedad: "+ antiguedad );
            System.out.println("Nombre empleado: "+ nombre);
            System.out.println("Sueldo bruto: "+totalBruto+ "$ \n");
            System.out.println("Descuentos: "+descuentos+"$ \n");
            System.out.println("Sueldo neto: "+valorNeto+"$ \n");           
        }
        
        
        
        
    }
    
}
