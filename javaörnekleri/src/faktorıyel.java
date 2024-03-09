
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class faktorıyel {
    public static void main(String[] args) {
         Scanner x=new Scanner(System.in);
         System.out.println("bir sayi giriniz:");
         int deger=x.nextInt();
         int faktorıyel=1;
         for(int i=1;i<=deger;i++){
             faktorıyel=faktorıyel*i;
             
                     
         }
         System.out.println(faktorıyel);
    }
    
}
