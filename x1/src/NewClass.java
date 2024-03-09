/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
import java.io.File;
import java.io.IOException;
public class NewClass {
    
    
    public static void main(String[] args) {
        ///---> Değişken ve File Sınıfının Tanımlanma İşlemleri <---\\\
        String ayrac = new String(new char[15]).replace("\0", "-");
        
        File  dosya = new File("C:\\Users\\elale\\OneDrive\\Masaüstü\\fileReader-dosya-elanur.txt");
        System.out.println(ayrac+"\n < Java Dosya İslemlerinin Metot Yapıları >\n"+ayrac);
        
        if(dosya.exists()){
            System.out.println("-> Belirtilen dizin yolunda, belirtmiş olduğunuz dosya zaten mevcut.\n"+ayrac);
        }
        else{
            try{
                dosya.createNewFile();
                System.out.println("-> Basarılı bir sekilde, dizin üzerinde belirtmiş olduğunuz isimde dosya oluşturuldu.\n"+ayrac);
            }
            catch (IOException e){
                System.out.println("-> Dosya oluşturulurken hata oluştu !!!\n-> Hatanın Mesajı: "+ e.getMessage()+"\n"+ayrac);
            }
        }
        System.out.println("-> Dosyanın Adı: " + dosya.getName()+"\n-> Dosyanın Dizin Yolu: "+ dosya.getPath());
        System.out.println("-> Dosyanın Boyutu: " + dosya.length()+"\n-> Dosyanın Okunabilirlik Durumu: " + dosya.canRead());
        System.out.println("-> Dosyanın Mevcut Adını [\""+dosya.getName()+"\"] Değiştirerek [\"dosya-metotlari.txt\"] Yapalım.");
        File degistir = new File("C:\\Users\\elale\\OneDrive\\Masaüstü\\fileReader-metotlari.txt");
        dosya.renameTo(degistir); ///---> Dosyamızın İsmi Değiştirildi <---\\\
        System.out.println("-> Dosyayı Silelim: " + dosya.delete()+"\n-> Dosya Mevcut Mu: " + dosya.exists()+"\n"+ayrac);
    }
}

