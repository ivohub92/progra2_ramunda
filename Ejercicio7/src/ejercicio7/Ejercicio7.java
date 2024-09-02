/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio7;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Ejercicio7 {

    
    public static void main(String[] args) {
        
        Scanner ingresado= new Scanner(System.in);
        int dia, mes, anio;
               
        System.out.println("Ingrese dia");
        dia= ingresado.nextInt();
        System.out.println("Ingrese mes");
        mes= ingresado.nextInt();
        System.out.println("Ingrese anio");
        anio= ingresado.nextInt();
        
        if (verificarFecha(dia, mes, anio))
        {
            calcularDiasVividos(dia, mes, anio);
        }else{
            System.out.println("");
        }          
    }
    private static void calcularDiasVividos(int dia,int mes,int anio)
    {
        LocalDate  fechadeNac= LocalDate.of(anio,mes, dia);   
        LocalDate fechaActual= LocalDate.now();
        long diasVividos= ChronoUnit.DAYS.between(fechadeNac,fechaActual);
        System.out.println(diasVividos+" son los dias vividos");
    }
    private static boolean verificarFecha(int dia,int mes,int anio)
    {
        boolean esValido= true;
        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)
        {
            if(dia<1 || dia>31){
                System.out.println("Eror, corregir. El mes "+mes+" posee entre 1 o 31 días");
                esValido=false;
            }
        }
        else if(mes==4 || mes==6 || mes==9 || mes==11)
        {
            if(dia<1 || dia>30){
                System.out.println("Eror, corregir. El mes "+mes+" posee entre 1 o 30 días");
                esValido=false;
            }
        }
        else if(mes==2)
        {
            if(anio%4==0 && anio%100!=0 || anio%400==0)
            {
                if(dia<1 || dia>29){
                    System.out.println("Eror, corregir. El mes "+mes+" posee entre 1 o 29 días");
                    
                }
                else if(dia<1 || dia>28){
                    System.out.println("Eror, corregir. El mes "+mes+" posee entre 1 o 28 días");                    
                }
                esValido=false;
            }
        }
        return esValido;
    }
    
}
