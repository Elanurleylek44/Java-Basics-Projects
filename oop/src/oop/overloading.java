/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop;

/**
 *
 * @author elale
 */

    public class overloading {
    //cikti adında 3 tane metot oluşturduk ve içerisine parametreleri yazdık.
    public static void cikti(int a){
        System.out.println("Çıktı = " + a);
    }

    public static void cikti(int a, int b){
        System.out.println("Çıktı = " + a + " & " + b);
    }
    public static void cikti(int a, int b, int c){
        System.out.println("Çıktı = " + a + " & " + b + " & " + c);
    }
    //Main metodumuzu oluşturduk.
    public static void main(String[] args) {
        //parametrelerimize değerler atıyarak metodumuzu çalıştırdık.
        cikti(3);
        cikti(3, 6);
        cikti(3, 6, 9);
    }
}
    

