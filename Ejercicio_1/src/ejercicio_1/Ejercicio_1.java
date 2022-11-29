/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
            Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
            dos. El programa deberá después mostrar el resultado de la suma
        */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el Numero 1:");
        int num1 = leer.nextInt();
        System.out.println("Ingrese el Numero 2:");
        int num2 = leer.nextInt();
        sumaEnteros(num1,num2);
    }
    public static void sumaEnteros(int n1,int n2){
        int resultado=n1+n2;
        System.out.println("El resultado de la Suma de "+n1+" y "+n2+" es: "+resultado);
    }
}
