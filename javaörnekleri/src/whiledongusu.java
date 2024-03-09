
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class whiledongusu {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
        System.out.println("1.sayiyi gir:");
        int sayi1=input.nextInt();
        System.out.println("2.sayiyi gir:");
        int sayi2=input.nextInt();
        int i=sayi1;
        while(i<=sayi2){
            
            if(i%2==0){
                System.out.println(i);
                 
            }
            i++;
        }
    }
    
}
