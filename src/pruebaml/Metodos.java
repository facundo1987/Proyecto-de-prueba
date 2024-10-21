/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaml;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author 46390835
 */
public class Metodos {
    
    public static int[] union (int [] a, int[] b){
        
        int [] union = new int [a.length + b.length];
        
        for (int i = 0; i < a.length; i++) {
            union[i]=a[i];
            
        }
        
        for (int i = 0; i < b.length; i++) {
            union[a.length + i]=b[i];
            
        }
        
        
        return union;


}
    
   

        
        
    
    
   
}
