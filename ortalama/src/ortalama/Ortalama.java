/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
58 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ortalama;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class Ortalama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        //kullanıcı 3 sayı girsin
        System.out.println("üç sayı giriniz:");

         double sayi1=input.nextDouble();
         double sayi2=input.nextDouble();
         double sayi3=input.nextDouble();
         //ortalama hesaplanır
         double ortalama =(sayi1+sayi2+sayi3)/3;
         System.out.println(sayi1+""+sayi2+""+sayi3+""+"Ortalaması:"+ortalama);
         
         
        
    }
    
}
