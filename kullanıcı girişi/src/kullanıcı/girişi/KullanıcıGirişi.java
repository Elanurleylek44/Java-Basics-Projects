/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kullanıcı.girişi;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class KullanıcıGirişi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
        Scanner input= new Scanner(System.in);
        System.out.print("kullanıcı adını giriniz:");
        String kullaniciAdi=input.nextLine();
        System.out.print("şifreyi giriniz:");
        String sifre=input.nextLine();
        
        if(kullaniciAdi.equals("ela")&&sifre.equals("123")){
            System.out.println("GİRİŞİNİZ BAŞARILI!!!");
        }else{
            System.out.println("GİRİŞİNİZ BAŞARISIZ!!");
            
        }
            
        
        
    }
    
}
