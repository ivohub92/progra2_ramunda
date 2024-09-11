/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validanumeros;


/**
 *
 * @author Ivan
 */
public class ValidaNumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ControladorNumeros controlador= new ControladorNumeros(10);
        
        controlador.ingresarNumero();
        System.out.println("Min: "+ controlador.getMin());
        System.out.println("Max: " + controlador.getMax());
        System.out.println("Promedio: "+ controlador.promedio());
    }
    
}
