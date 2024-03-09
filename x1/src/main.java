
import java.io.FileReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class main {

    public static void main(String[] args) {
        
        
        // degisken ve file sınıfının tanımlanma işlemleri
        
        String ayrac=new String(new char[15]).replace("\0","-");
        String okunanveri=null;
        
        File dosya=new File("C:\\Users\\elale\\OneDrive\\Masaüstü\\fileReader-dosya-elanur.txt");
        
        //filereader ile dosya okıuma işlemi için gerekli tanımlama
    FileReader fileReader;
   char veriler [] =new char[(int) dosya.length()];
   
   // dosya okuma işlemi gerceklestirelim
        System.out.println(ayrac+"\n< java filereader dosya okuma işlemi >"+ayrac);
         try{
             fileReader=new FileReader(dosya);
             fileReader.read(veriler);
             System.out.println(veriler);
         }
         catch(FileNotFoundException e){
              System.out.println("aradıgınız dosyaya ulasamadım\n-> hata mesajim:"+e.getMessage());
         }
         catch(IOException exception){
             System.out.println("-> aradıgınız dosya üzerinde veri okuyamıyorum"+exception.getMessage());
             
         }
         finally{
             System.out.println(ayrac) ;
         }
        
   
    
}
}