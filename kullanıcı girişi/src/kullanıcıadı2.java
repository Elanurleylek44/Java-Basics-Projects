
      
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class kullanıcıadı2 {
    public static void main(String args[]){
        Scanner input=new Scanner(System.in);
        System.out.println("kullanıcıAdi giriniz:");
        String kullanıcıAdi=input.nextLine();
        System.out.println("sifre giriniz:");
        String sifre =input.nextLine();     if(kullanıcıAdi.equals("ela")&&sifre.equals("1234")){
         System.out.println("girisiniz basarılı");
     }else{                               
         System.out.println("girisiniz basarısız");
     }
            
            
    
    }
}


