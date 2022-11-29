/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese la Temperatura en ºC:");
        float temp_celcius = leer.nextFloat();
        
        float temp_fahrenheit= 32f + ((9f*temp_celcius)/5f);
        
        System.out.println("La conversión en Grado Fahrenheit es: "+temp_fahrenheit);
        
    }
    
}
