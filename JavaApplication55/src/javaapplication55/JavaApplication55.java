/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication55;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class JavaApplication55 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        
       int  faktoriyel=1;
        System.out.print("Bir sayi giriniz: ");
        int sayi = scan.nextInt();
        
        for(int i=1;i<=sayi;i++){
            faktoriyel=faktoriyel*i;
      
        }
        System.out.println(faktoriyel);
    }
    
}
