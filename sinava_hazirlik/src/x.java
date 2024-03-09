
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class x {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       System.out.print("ilk sehri yaz:");
       String sehir1=input.nextLine();
       
        System.out.println("2.sehiri gir:");
        String sehir2=input.nextLine();
        if (sehir1.compareTo(sehir2)<0)
            System.out.println("sehirlerin alfabetik sırası:"+sehir1+","+sehir2);
        else
            System.out.println("sehirlerin alfabetik sırası:"+sehir2+","+sehir1);
            
        
    }
    
}
