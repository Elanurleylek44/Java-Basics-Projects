
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class siralama1 {
    public static void main(String[] args) {
        
      // Dizi Tanımlaması:
        int [] karisikVeriler = {7,4,2,6,1,5,3};
        // Dizi Sıralama İşlemi:
        Arrays.sort(karisikVeriler);
        // Dizi Elemanlarını Ekrana Yazdırma:
        for(int i=0;i<karisikVeriler.length;i++){
            System.out.print(karisikVeriler[i]+"\t");
    }
    
   }

     
    
    
    
}

