/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aybars;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class Aybars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("birinci kardeşin yaşını giriniz:");
        
        int yaş1=  input.nextInt();
        System.out.println("ikinci kardeşin yaşını giriniz:");
        int yaş2=input.nextInt();
          int ortalama = (yaş1+yaş2)/2;
          
          
         
        System.out.print(ortalama);
        
        
        
        
    }
    
}
