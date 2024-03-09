
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class gozcudeger {
    public static void main(String []args){
        Scanner input=new Scanner(System.in);
        System.out.println("Bir tam sayi giriniz:"+"(0girilirse giris sonlanır!:");
        int veri=input.nextInt();
        int toplam=0;
        while(veri!=0){
            toplam+=veri;
            System.out.println("bir tam sayi giriniz:"+"(0 girilirse giris sonlanir!");
            veri=input.nextInt();
            
        }
        System.out.println("toplam:"+toplam);
                
    }
    
}
