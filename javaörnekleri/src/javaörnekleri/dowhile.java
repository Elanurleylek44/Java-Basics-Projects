/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaörnekleri;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class dowhile {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int toplam=0;
        int sayi;
        do{
            System.out.println("sayi gir:");
            sayi=input.nextInt();
        toplam=toplam+sayi;
        
        }while(sayi!=5);
        System.out.println(toplam);
    }
    }


    
    

    

