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
public class ebob {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1.sayı:");
        int sayi1=input.nextInt();
        System.out.println("2.sayi:");
        int sayi2=input.nextInt();
        int k=2;
        
        int ebob=0;
       while(k<=sayi1&&k<=sayi2){
           if(sayi1%k==0&&sayi2%k==0)
               ebob=k;
           k++;
           }
        System.out.println("ebob"+ebob);
       }
    
    }
   
}
