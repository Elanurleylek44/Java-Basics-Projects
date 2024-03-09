
import java.util.Base64;
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
        System.out.println("1 den 7 ye kadar 1 sayi gir:");
        int gun=input.nextInt();
        switch(gun){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:System.out.println("hafta ici");
            break;
            
            case 6:
            case 7:System.out.println("hafta sonu");
                
                
        }
    }
    
}
