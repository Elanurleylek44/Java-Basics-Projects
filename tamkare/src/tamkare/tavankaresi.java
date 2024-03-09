/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tamkare;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class tavankaresi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
      Scanner input=new Scanner(System.in);
        System.out.println("bir sayi girin asal olup olmadıgına bakayyım");
        int sayi=input.nextInt();
        int sayac=0;
        for(int i=2;i<sayi;i++){
            if(sayi%i==0){
 
             sayac++;
            }
        }
        if(sayac==0){
            System.out.println("sayi asaldır");
            
        }else{
            System.out.println("asal degildir");
        } 
    }
    
}
    

