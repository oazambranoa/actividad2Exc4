/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad2exc4;

/**
 *
 * @author oazambranoa
 */

/* Enunciado:

 Ejercicio resuelto Nº 7
Hacer un algoritmo que, dados dos valores numéricos A y B, escriba un mensaje diciendo
si A es mayor, menor o igual a B.

*/

import java.util.Scanner;

public class Actividad2Exc4 {

    public static void main(String[] args) {
        
        double A, B;
        
        System.out.println("Ingrese el valor de A: ");
        Scanner a = new Scanner(System.in);
        A = a.nextDouble();
        
        System.out.println("Ingrese el valor de B: ");
        Scanner b = new Scanner(System.in);
        B = b.nextDouble();
        
        if (A > B){
            System.out.println("A es mayor que B");     
        }
        else if(A == B){
            System.out.println("A es igual que B");
        }
        else{
            System.out.println("A es menor que B");
        }
        
    }
}
