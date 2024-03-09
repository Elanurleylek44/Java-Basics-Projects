
import java.security.DigestInputStream;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class string {
    public static void main(String[]args){
        String isim ="Elanur";
        System.out.println(isim.charAt(4));
        int indis=isim.indexOf("E");
        System.out.println(indis);
        System.out.println(isim.substring(0,4));
        System.out.println(isim.contains("sevim"));
        isim="aybars leylek";
        isim=isim.replace("leylek","taskaya");
        System.out.println(isim);
        String cumle="ne güzel bir gun";
        String[]kelimeler=cumle.split(" ");
        System.out.println(kelimeler[2]);
                
    }
    
}
