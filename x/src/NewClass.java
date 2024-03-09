
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
         Scanner input=new Scanner(System.in);
         System.out.println("bir a sayısı giriniz:");
         int a=input.nextInt();
         System.out.println("a:"+a);
         
         
         System.out.println("bir b sayısı giriniz:");
         int b=input.nextInt();
         System.out.println("b:"+b);
         
         int c;
         System.out.println("c:");
        System.out.println(Math.sqrt(a*a+b*b));
        
             
         
    }
    
}
