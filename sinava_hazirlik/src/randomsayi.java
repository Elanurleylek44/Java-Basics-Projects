
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class randomsayi {
    public static void main(String[]args){
        //iki tane random sayiuret
        
        int sayi1 =(int)(Math.random()*10);
        int sayi2=(int)(Math.random()*10);
        //2.sayi <sayi ise sayi 1ve sayi 2 yi yer degistir
        if (sayi1<sayi2){
        int temp =sayi1;
        sayi1= sayi2;
        sayi2=temp;
    }
        
    }
}
