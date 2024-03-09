/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kullanıcıgirişi2;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class Kullanıcıgirişi2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
         Scanner input= new Scanner(System.in);
         System.out.println("kullanıcı adını gir:");
          String kullaniciAdi=input.nextLine();
          System.out.println("sıfreyı gir:");
            String sifre=input.nextLine();
          
          if(kullaniciAdi.equals("leylek")&&sifre.equals("12345")){
              System.out.println("girişiniz basarili!");
          }
          else{
              System.out.println("giris basarisiz!");
          }
          
                  
         
        
    }
    
}
