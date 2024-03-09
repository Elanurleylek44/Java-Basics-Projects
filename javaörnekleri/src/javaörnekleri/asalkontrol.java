package javaörnekleri;


import static java.time.temporal.TemporalAdjusters.next;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class asalkontrol {
    public static boolean asalKontrol(int sayi){
        boolean sonuc=true;
        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
                sonuc= false;
                break;
                
                
            }
        }
        return sonuc;
                }
           
            
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("1 sayı gir:");
        int sayi= input.nextInt();
        if(asalKontrol(sayi)==true){
            System.out.println("sayi asaldır");
        
        }else{
            System.out.println("sayi asal degildir");
        }
        System.out.println("");
    }
    
}

