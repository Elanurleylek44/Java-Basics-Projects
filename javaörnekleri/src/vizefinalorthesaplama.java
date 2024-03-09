
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class vizefinalorthesaplama {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("vize notunuzu girin:");
        int vizeNotu=input.nextInt();
        System.out.println("final notunuzu girin:");
        int finalNotu=input.nextInt();
        double ortalama =vizeNotu*0.4+finalNotu*0.6;
        System.out.println("notunuz"+ortalama);
        if(ortalama>50){
            System.out.println("gectiniz");
        }else{
            System.out.println("kaldınız!!!!!!!");
                 
                
                  
        }
        
    }
}
