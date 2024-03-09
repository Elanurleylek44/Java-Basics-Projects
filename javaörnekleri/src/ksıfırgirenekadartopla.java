
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class ksıfırgirenekadartopla {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int toplam=0;
        int sayi;
        
        while (true) {
            System.out.println("sayi gir:");
            sayi =input.nextInt();
            if (sayi==0) {
                break;
                
            }else{
                toplam=toplam+sayi;
                
            }
            System.out.println(toplam);
            
        }
        
    }
    
}
