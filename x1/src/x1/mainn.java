/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package x1;

import java.io.File;
import java.io.IOException;

/**
 *
 * @author elale
 */
public class mainn {

    public static void main(String[] args) {
         String ayrac=new String(new char[20]).replace("/0", "-");
                 File dosyam=new File("C:\\Users\\elale\\OneDrive\\Masaüstü\\fileReader-dosya-leylek.txt");
                 System.out.println(ayrac+"java dosya islemlerinin metot yapilari"+ayrac);
                 
                 if(dosyam.exists()){
                      System.out.println("dosya zaten va"+ayrac);
                      
                 }else{
                     try{
                         dosyam.createNewFile();
                         System.out.println("basarili bir sekilde yeni dosya olusturuldu");
                     }catch(IOException e){
                         System.out.println("dosya olusturulurken hata olustu"+e.getMessage());
                         
                     }
                 }
                 
                 System.out.println("dosya adi:"+dosyam.getName()+"dosyanın dizin yolu:"+dosyam.getPath());
                 System.out.println("dosyanın boyutu:"+dosyam.length()+"dosyanin okunabilirlik boyutu :"+dosyam.canRead());
                 
    
    }
}