
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class metodlartemel {
  //  public static void kendiniTanıt(){
    //  System.out.println("soyadı:leylek");
       // System.out.println("okulu:fırat unıversitesi");
       // System.out.println("yasadıgı sehir:malatya");
    //}
 //   public static void main(String[] args) {
   //     kendiniTanıt();
     //   kendiniTanıt();
   // }
    public static void ortalamaAl(int sayi1,int sayi2){
         int toplam =sayi1+sayi2;
         double ort =toplam/2;
         System.out.println(ort);
    }
    public static void main(String[]arg){
        ortalamaAl(34, 45);
        ortalamaAl(50, 650);
         Scanner input =new Scanner (System.in);
         System.out.println("1.sayiyi gir:");
         int sayi1=input.nextInt();
         System.out.println("2.sayiyi gir:");
         int sayi2=input.nextInt();
         ortalamaAl(sayi1, sayi2);
    }
     
}
            
    

