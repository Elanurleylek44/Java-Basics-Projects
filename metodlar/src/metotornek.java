
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class metotornek {
    public static void buyukBul(int sayi1,int sayi2){
        if(sayi1>sayi2){
            System.out.println(sayi1+"buyuktur");
        }else if(sayi2>sayi1){
            System.out.println(sayi2+"buyuktur");
        }else{
            System.out.println("her iki sayida esıttır");
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("1.sayıyı gir:");
        int sayi1=input.nextInt();
        System.out.println("2.sayı gir:");
        int sayi2=input .nextInt();
        buyukBul(sayi1,sayi2);
    }
}
