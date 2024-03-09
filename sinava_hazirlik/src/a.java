
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class a {
    public static void main(String[] args) {
    int top=0;
    int sayi=0;
    
    while(sayi<20){
        sayi++;
        if(sayi==10||sayi==11)
            continue;
        top+=sayi;
    }
        System.out.println("sayi:"+sayi);
        System.out.println("top"+top);
    }
}

