/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio_2;
import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int x ,y;
        int suma =0;
        
        System.out.println("dame el primer valor ");
        x = entrada.nextInt();
        
        System.out.println("dame el segundo valor ");
        y = entrada.nextInt();
        
        suma += x;
        x += y^2; 
        suma += x/y;
        
        System.out.println("EL VALOR DE LA SUMA ES: " + suma);
    }
}
