/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_3;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una Frase: ");
        String frase= leer.nextLine();
        
        System.out.println("Frase en Mayúsculas: "+frase.toUpperCase());
        System.out.println("Frase en Minúsculas: "+frase.toLowerCase());
        
    }
    
}
