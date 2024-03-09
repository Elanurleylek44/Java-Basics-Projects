
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class soru1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
       
        System.out.println("sayi gir:");
        int n=input.nextInt();
        Random random=new Random();
        int[]liste=new int[n];
        for(int i=0;i<n;i++){
            liste[i]=2023100+random.nextInt(299);
        }
        System.out.println("rastgele secilen ogrenci nolrarı:");
        for(int i=0;i<liste.length;i++){
            System.out.println((i+1)+".ogrenci:"+liste[i]);
            
            
            
            
        }
        
        
    }
}
