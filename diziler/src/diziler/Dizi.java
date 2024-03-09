/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diziler;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author elale
 */
public class Dizi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

           // Dizi Tanımlaması:
        int [] asilVeri = {1,4,7,132,62,87,93};
        int [] kopyaVeri={};

        //Asıl Diziyi Ekrana Yazdırma İşlemi:
        System.out.print("-----\n- Asıl Verimiz: ");
        for(int i=0;i<asilVeri.length;i++)
            System.out.print(asilVeri[i]+" ");

        // Kopyalama İşlemi:
        kopyaVeri = Arrays.copyOfRange(asilVeri,0,4);
        System.out.print("\n-----\n- Kopya Veri: ");
        for(int i=0;i<kopyaVeri.length;i++)
            System.out.print(kopyaVeri[i]+" ");
        System.out.println("\n-----");
    }
}