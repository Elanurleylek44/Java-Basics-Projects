/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalıtım;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class bolme {
   public static int bolme(int sayi1,int sayi2){
       if(sayi2==0){
           System.out.println("bolen sifir olamaz");
           System.exit(3);
       }
        return sayi1/sayi2;
    }
    public static void main(String[] args) {
        Scanner giris=new Scanner(System.in);
        
        System.out.print("2 tam sayi gir");
        int sayi1=giris.nextInt();
         int sayi2=giris.nextInt();
         
         int sonuc=bolme(sayi1, sayi2);
         System.out.println(sayi1+"/"+sayi2+"="+sonuc+"dir."
                 + "");
         
    }
    
}
