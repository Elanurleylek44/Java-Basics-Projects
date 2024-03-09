
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class deneme {
    public static void main(String[] args) {
        
    }
        Scanner input=new Scanner(System.in); 
        int ekok=0;
        int max;
        System.out.println("sayi1:");
        int sayi1=input.nextInt();
        
        System.out.println("sayi2=");
        int sayi2=input.nextInt();
        
        max=sayi1*sayi2;
        for(int k=max;k>0;k--){
            if (k%sayi1==0 && k%sayi2==0) {
                ekok=k;
            }
            }
        System.out.print("ekok="+ekok);
    }
            
    
}
