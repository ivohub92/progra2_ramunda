/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

public class NumeroPerfecto {

    public static void main(String[] args) {
        int contador=0;
        int i=4;
        int suma;
        try
        {
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
        }catch(Exception e){
            System.out.println("Error desconocido");
        }
    }    
}
