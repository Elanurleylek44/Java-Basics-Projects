/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tahminoyunu;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author elale
 */
public class Tahminoyunu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner scan = new Scanner(System.in);
        Random rastgele = new Random();
        int rastgele_sayi = 1 + rastgele.nextInt(49);
        //System.out.println("Rastgele atanan sayi = " +rastgele_sayi);
        System.out.println("Rastgele sayi 1 ile 50 arasındadır.");
        int sayi,sayac = 0;
         
        do {
            System.out.print("Bir sayi giriniz: ");
            sayi = scan.nextInt();
            if(sayi > rastgele_sayi) {
                System.out.println("Sayiyi küçültün.");
            }
            else if(sayi < rastgele_sayi) {
                System.out.println("Sayiyi büyütün.");
            }
            sayac++;
        }
        while(sayi != rastgele_sayi);
         
        System.out.println("Tebrikler!! " + sayac + ". denemede sayıyı buldunuz.");
    }
}
    
    

++
