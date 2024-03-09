/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tahminoyn;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class Tahminoyn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //tahmın edilecek sayıyı üretme
        int sayi=(int)(Math.random()*101);
        Scanner input=new Scanner(System.in);
        
        System.out.println("0 ile 100 arasından bir tam sayi giriniz");
        int tahmin=-1;
        
        
        
        while(tahmin!=sayi){
        System.out.println("\ntahmin ediniz:");
        tahmin=input.nextInt();
    
        
        if(tahmin==sayi)
            System.out.println("tebrikler bildiniz");
                    
        
         else if(tahmin>sayi)
             System.out.println("tahmininiz cok yuksek:");
        
        
          
         
        else
             System.out.println("tahmınınız cok kucuk");
         
    }
    
}
}
