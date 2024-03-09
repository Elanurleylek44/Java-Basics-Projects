/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tckimliknosununsonhanesi;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class Tckimliknosununsonhanesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("tc kimlik no giriniz:");
        String tckimlikno=input.nextLine();
        char sonRkam=tckimlikno.charAt(10);
        
        switch(sonRkam){
            case'0':
                System.out.println("1.01.2023");
                break;
            case'2':
                 System.out.println("2.01.2023");
                 break;
                 default:
                 System.out.println("bir hata oluştu...");
                 break;
                 
                    
        }
            
    }
    
}
