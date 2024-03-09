/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hatalar;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class Hatalar {

    
    

  
        
    public static int bolme(int sayi1,int sayi2){
        
    
        if(sayi2==0){
            throw new ArithmeticException("bolen sifir olamaz");
             
        }
        return sayi1/sayi2;
        
    }
    
        public static void main(String[] args) {
        
    
      
                
          Scanner input=new Scanner(System.in);
      
        System.out.println("2 sayı girin:");
        
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();
        
        try{
        int sonuc=bolme(sayi1, sayi2);
         
            System.out.println(sayi1/sayi2+"="+sonuc+"dir");
        
        }
        catch(ArithmeticException e){
            System.out.println("istisna:bir tamsayı sifira bolunmez");
        }
               
            System.out.println("yurutme devam ediyort");
}
        
        
        
        
        
        

    }

