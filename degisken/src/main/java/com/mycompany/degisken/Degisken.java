/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.degisken;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class Degisken {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.print("Lütfen bir tamsayi giriniz:");
         int sayi1;
        sayi1 = input.nextInt();
         System.out.println(sayi1);
         System.out.print("ikinci sayiyi gir");
            int sayi2= input.nextInt();
                 int toplam =sayi1 +sayi2;
                 System.out.print(toplam);
                 System.out.println("işlem tipi");
      byte islem=input.nextByte();
      switch(islem){
          case 1:
              System.out.println(sayi1 + sayi2);
              break;
          case 2:
              System.out.println(sayi1-sayi2);
              break;
          case 3:
              System.out.println(sayi1/sayi2); 
              break;
          case 4:
              System.out.println(sayi1*sayi2);
              break;
          default:
              System.out.println("hatalı bir sayı girdiniz");
              break;
              
               
                       
                       
                       
                      
      }               
    }
}
