 
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class ebobekok {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1.sayiyi gir:");
        int sayi1=input.nextInt();
        System.out.println("2.sayiyi giriniz");
        int sayi2=input.nextInt();
       int ebob=0;//baslangıc ebobu 
        int k=2;//potansiyel ebob
        while(k<=sayi1&&k<=sayi2){//
            if(sayi1%k==0&&sayi2%k==0)//iki sayınında k ya bolumunden kalan 0 ise
                ebob=k;//ebob guncelle
            k++;
    }
            System.out.println(sayi1+"ve"+sayi2+"icin"+"en buyukortak bolen:"+ebob);   
 
   
    
        
    }
}

