
import java.util.Random;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class NewClass {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
        System.out.println("bir dosya tam adi giriniz:");
        String dosyaAdi=input.nextLine();
        String []parcalar=dosyaAdi.split("\\.");
        System.out.println("dosya adi:"+parcalar[0]);
        System.out.println("dosya uzntısı"+parcalar[1]);
        }
       
        
        
    
}
