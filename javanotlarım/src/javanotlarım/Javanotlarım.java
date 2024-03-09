/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javanotlarım;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class Javanotlarım {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //bu projeyi bazı şeyleri hatırlamam gerektiğinde bakmak içi yazıyorum!!!!!
        // degişkenleri 
        
        int sayi=12;
        
        //string değişkeninde tırnak kullanılır.
        String yazi ="merhaba ben ela";
        // bir değiskenin yanına 2 kelime bir şey yazacaksak ikinci kelimenin ilk harfi büyuk ve bitişik yazılır!!
        
        System.out.println(sayi);
        System.out.println(yazi);
        /*
         * sıralama : (1 byte 8 bittir.)
         * byte:(1 byte )yer kaplar-128 127 arasında
         * short : 16 bittir. yani(2 byte)
         * int :(4 byte) 32 bittir
         * long:64 bit ( 8 byte )
         * tam olmayanlar float ve double
         * bi sahil diye ezberleyebilirsin.
         * float: 4 byte
         * double: 8 byte
         * char : 2 byte
         * boolean: diğer değişkenlerden farklı olarak  sadece 2 farklı değer alır. true ve false .bellekte 1 bit yer kaplar. mantıksal tipler olarak da bilinir.
         
       
         * mantıksal operatörler: 
         * Ve : a && b
          Veya : a || b
          Değil : !(a&&b)
        
        konsoldan veri almak içi aşağıdaki kod satırı kullanılır.
    **/
  
  
    Scanner input = new Scanner(System.in);
    int a,b;
    
    System.out.println("A sayısını giriniz : ");
    a = input.nextInt();
    
    System.out.println("B sayısını giriniz : ");
    b = input.nextInt();
    
    System.out.println("A Sayısı : " + a);
    System.out.println("B Sayısı : " + b);
    
  }
}
      /**
       * koşul doğruysa if kullanılır.
       * if (koşul) {
  // koşul doğruysa yapılacak işlemler
}
       * } else {
  // koşul yanlış ise çalışacak kod bloğu
}

       * if (koşul1) {
  // koşul1 doğru ise bu kod bloğu çalışacaktır.
} else if (koşul2) {
  // eğer koşul1 doğru değil ise ve koşul2 doğru ise bu kod bloğu çalışacaktır.
} else {
  // koşul1 ve koşul2 doğru değil ise bu kod bloğu çalışacaktır.
}
switch(değer) {
  case x:
    // değer x'e eşitse bu kod bloğu çalışacak
    break;
  case y:
       // değer y'ye eşitse bu kod bloğu çalışacak
    break;
  default:
      // değer hiç bir şeye eşit değilse bu kod bloğu çalışacak
}
* int gun = 2;
switch (gun) {
  case 6:
    System.out.println("Bugün cumartesi");
    break;
  case 7:
    System.out.println("Bugün pazar");
    break;
  default:
    System.out.println("Bugün hafta içi");
}
// Çıktısı "Bugün hafta içi"
             

    
    
  