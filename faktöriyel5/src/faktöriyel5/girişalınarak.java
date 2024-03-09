/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faktöriyel5;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class girişalınarak {
    public static void main(String []args){
        System.out.print("faktöriyeli hesaplanacak sayıyı giriniz:");
         Scanner input=new Scanner(System.in);
         int sayi=input.nextInt();
         int sonuc=1;
         for(int i=1;i<=sayi;i++){
             sonuc=sonuc*i;
             
         }
             System.out.println(sonuc);  
    }
    
}
