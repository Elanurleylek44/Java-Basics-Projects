/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinava_hazirlik;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class ekok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int max;
        int ekok=0;
        
        System.out.println("sayi1 :");
        int sayi1=input.nextInt();
        
        System.out.println("sayi2:");
        int sayi2=input.nextInt();
        
        
        max=sayi1*sayi2;//sayilar aralarında asal ise ekoku carpımlarıdır.
        for(int i=max;i>0;i--){
            if(i%sayi1==0 && i%sayi2==0 ){
        
               ekok=i;
            
            }
        }
    
    
                    
       System.out.print("ekok:"+ ekok);
    }
    }
    

