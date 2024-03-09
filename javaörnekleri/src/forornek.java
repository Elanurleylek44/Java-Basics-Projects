
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class forornek {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("1.sayiyi giriniz:");
        int sayi1=x.nextInt();
        System.out.println("2.sayiyi giriniz:");
        int sayi2=x.nextInt();
        for(int i=sayi1;i<sayi2;i++){
            if(i%2==0){
                System.out.println(i);
                
            }
        }
                
                
        
    }
    
}
