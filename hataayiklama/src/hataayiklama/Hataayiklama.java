/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hataayiklama;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class Hataayiklama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("birinci sayiyi gir:");
        int sayi1=input.nextInt();
        
        System.out.print("ikinci sayiyi gir:");
         int sayi2=input.nextInt();
        
        
       int sonuc;
       
       try{
           sonuc =sayi1/sayi2;
           
           System.out.println(sonuc);
            
        }
       catch(ArithmeticException e){
           System.out.println("bolen sifir olamaz."
                   + "tekrar bir sayi giriniz");
          sayi2 =input.nextInt();
       
       }
       sonuc =sayi1/sayi2;
       
           System.out.println(sonuc);
    }
    
}
