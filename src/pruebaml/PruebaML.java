/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pruebaml;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 46390835
 */
public class PruebaML {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creo metodo Scanner 
        Scanner input = new Scanner (System.in);
        
        // creo las dos listas
        int [] listaA = new int [3];
        int [] listaB = new int [4];
        
        //Solicito los elementos para cada lista con un for
        System.out.println("Bienvenido ingrese 3 enteros para la lista A ");
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese el numero " + (i + 1));
            int numero = input.nextInt();
            listaA[i] = (numero);
            
        }
        
        //Bucle for para mostrar como quedo la lista A
        
        System.out.println("Lista A quedo conformada asi " );
        for (int i = 0; i < listaA.length; i++) {
            System.out.println(listaA[i]);
            
        }
        System.out.println("-------------------");
        System.out.println("Ahora ingrese 4 enteros para la lista B");
        
            for (int i = 0; i < listaB.length; i++) {
            System.out.println("Ingrese el numero " + (i + 1));
            int numero = input.nextInt();
            listaB[i] = (numero);
            
        }
            
        //Bucle for para mostrar como quedo la lista A
        System.out.println("Lista B quedo conformada asi " );
         for (int i = 0; i < listaB.length; i++) {
            System.out.println(listaB[i]);
            
        }
         
         //Bucle for para utilizar metodo union y mostrar el resultado 
         
         System.out.println("UNION DE AMBAS LISTAS ");
            for (int i = 0; i < Metodos.union(listaA, listaB).length; i++) {
            
            System.out.println("numero -- " + (i + 1) +  " " + "es " + Metodos.union(listaA, listaB)[i]);
            
        }
    }
    
}
