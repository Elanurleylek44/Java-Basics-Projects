/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinava_hazirlik;

import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

/**
 *
 * @author elale
 */
public class toplamatesti {
    public static void main(String[] args) {
        
        int sayi1=(int)(System.currentTimeMillis()%10);
        int sayi2=(int)(System.currentTimeMillis()/7%10);
        
        Scanner input=new Scanner (System.in);
        
        System.out.println(sayi1+"+"+sayi2+"sonucu nedir?");
        int cevap=input.nextInt();
        System.out.println(sayi1+"+"+sayi2+"="+ cevap+"sonucu"+(sayi1+sayi2==cevap));
        
        
    }
}
