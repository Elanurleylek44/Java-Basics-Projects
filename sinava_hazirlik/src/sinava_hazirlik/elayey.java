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
public class elayey {
    public static void main(String[] args) {
         Scanner klavye=new Scanner(System.in);
         int dizi=new int[20];
         double top=0,ort=0;
         for(int i=0;i<20;i++){
             System.out.println("dizinin"+(i+1)+". elemanını gir");
             dizi[i]=klavye.nextInt();
             top+=dizi[i];
          
         }
         ort=top/dizi.length;
         
         
    }
    
}
