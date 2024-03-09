
import java.io.File;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
 import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DosyaIslemleri {
    public static void main(String[] args) {
        File ela = new File("ela.txt");

        try {
            if (ela.createNewFile()) {
                System.out.println("Dosya oluşturuldu.");
                FileWriter writer = new FileWriter(ela);
                writer.write("Merhaba, bu dosyaya yazıldı.  canım kendim cok seviyorum kendimi. jnHDC"
                        + "SAOUJHFVİUOHAFİOVHİOUFHVQUOHV");
                writer.close();
            } else {
                System.out.println("Dosya zaten var.");
            }
        } catch (IOException e) {
            System.out.println("Dosya oluşturma hatası: " + e.getMessage());
        }
    }
}