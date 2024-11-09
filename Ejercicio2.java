/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio2 {

    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            int primer_numero = sc.nextInt(), segundo_numero = sc.nextInt();
            System.out.println(
                    
                    
                    "Suma: " + (primer_numero + segundo_numero));
            System.out.println(
                    
                    
                    "Resta: " + (primer_numero - segundo_numero));
            System.out.println(
                    
                    "Multiplicacion: " + (primer_numero * segundo_numero));
            System.out.println(
                    
                    "Division: " + (primer_numero / segundo_numero));
            System.out.println(
                    
                    
                    "Modulo: " + (primer_numero % segundo_numero));
        }
    }
}
    

