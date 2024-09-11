/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package validanumeros;
import java.util.Scanner;



/**
 *
 * @author Ivan
 */
public class ControladorNumeros {
    //Atributos
    private int min;
    private int max;
    private int suma=0;
    private int cantNumero;
    private int contador=0;
    private Validadora validadora;
    
    //Metodos
    //Constructor
    public ControladorNumeros(int cantNumeros){
        this.min= 101;
        this.max= -101;
        this.suma=0;
        this.cantNumero= cantNumeros;
        this.validadora= new Validadora();
    }
    
    //Ingresar numero del usuario
    public void ingresarNumero()
    {
        Scanner ingresado= new Scanner(System.in);
        System.out.println("Ingrese" + cantNumero +" de numeros");
        while(contador<cantNumero)
        {
            try
            {
                int numero= ingresado.nextInt();
                //verificar que este en el rango
                if(validadora.validar(numero, -100, 100))
                {
                    actualizarEstadisticas(numero);
                    contador++;
                }
                else{
                    System.out.println("Numero fuera del rango");
                }
            }
            catch(Exception e){
                System.out.println("Error, ingrese numeros");
                ingresado.next();
            }
        }
    ingresado.close();
    // actualiza valores y hace calculos
    }
    private void actualizarEstadisticas(int numero)
    {
        if(numero<min)
        {
            min= numero;
        }
        if (numero>max)
        {
            max=numero;
            
        }
        suma += numero;
    }    
    public double promedio()
    {
        return (suma)/(double)(cantNumero);
    }
    public int getMin() {
        return min;
    }

    public int getMax() {
        return max;
    }

    public int getSuma() {
        return suma;
    }
}




