/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un número entero: ");
        int num=leer.nextInt();
        
        System.out.println("El Doble del número es: "+(2*num));
        System.out.println("El Doble del número es: "+(3*num));
        System.out.println("El Doble del número es: "+Math.sqrt(num));
        
        
    }
    
}
