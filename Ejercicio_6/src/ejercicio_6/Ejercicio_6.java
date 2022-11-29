/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_6;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el número a validar: ");
        int num = leer.nextInt();
        if (num%2 == 0){
            System.out.println("El número ingresado es Par.");
            
        }else{
            System.out.println("El número ingresado es Impar.");
        }
        
    }
    
}
