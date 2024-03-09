/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaörnekleri;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class manavuygulaması {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.println("kac kilo elma alcaksınız?");
        int elmakg=input.nextInt();
        int elmafiyat=2*elmakg;
        System.out.println("kaç kilo portakal alcaksınız?");
        int portakalkg=input.nextInt();
        int portakalfiyat=6*portakalkg;
        System.out.println("kaç kilo kiraz alcaksınız?");
        int kirazkg=input.nextInt();
        int kirazfiyat=2*kirazkg;
        
        int hesap= elmafiyat+portakalfiyat+kirazfiyat;
        System.out.println("hesap:"+hesap+"TL");
    
        
      
    }
    
}
