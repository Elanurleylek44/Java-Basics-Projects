

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class NewClass {
    public static void main(String[] args) {
        //kullanıcı tarafından tam sayı degerlerigirilen 20elemanlı bir dizideki en kucuk elemanı ve o elemana ait indisi bulan program
        Scanner input=new Scanner(System.in);
        System.out.println("dizi boyutu gir:");
        
         int n=input.nextInt();
         //dizi tanımlaması
         int sayilar[]=new int[n];
         int min = 0;
         
        
          for(int i=0;i<sayilar.length;i++){
            System.out.println("dizinin "+(i+1)+".  terimini giriniz");
             sayilar[i]=input.nextInt();
          
          
          if(sayilar[i] < min) {
             min = sayilar[i];
            }
            System.out.println("en kucuk sayi:"+min);
              System.out.println("minumum deger dizinin" + min+". indisinde bulunuyor");
              
        }
   }            
      
            
                    
            
          
           
           
       
        
        
        
         
      
            
            
        
    }
}
