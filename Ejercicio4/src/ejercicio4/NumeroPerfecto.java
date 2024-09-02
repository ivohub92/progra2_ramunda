/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

/**
 *
 * @author Ivan
 */
public class NumeroPerfecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int contador=0;
        int i=4;
        int suma;
        while(contador<4)
        {
            suma=0;
            for(int n=1 ;n<=i/2 ;n++)
            {                
                if(i%n==0)
                {
                    suma+=n;                    
                }
            }
            if(suma==i)
            {
                System.out.println(i+ " es numero perfecto");
                contador++;
            }
            i++;
        }
    }    
}
