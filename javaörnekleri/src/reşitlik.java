
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class reşitlik {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Dogum tarihinizi giriniz(yıl):");
        int dogumTarihi =input.nextInt();
       int yas;
       yas =2022-dogumTarihi;
       if(yas<18){
           System.out.println("resit degilsiniz");
           
       }else{
           System.out.println("resitsiniz");
       }
        
    }
    
}
