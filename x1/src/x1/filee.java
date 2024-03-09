/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package x1;
import com.sun.source.tree.CatchTree;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author elale
 */
public class filee {
    public static void main(String[] args) {
        File kitap=new File("kitap.txt");
        
        try{
            if(kitap.createNewFile()){
                System.out.println("kitap dosyası oluşturuldu.");
          FileWriter  writer=new FileWriter(kitap);
          writer.write("okunacak kitaplar");
           writer.write("dinle sakince");
           writer.write("bitiremedim seni içimde");
          
           writer.write("zor geliyor bazen yaşamak");
          
           writer.write("her şeyin bir sonu var");
          writer.close();
            }else{
                System.out.println("bu dosya zaten vAR");
            }
        }catch(IOException e){
            System.out.println("dosya bulunma hatası"+ e.getMessage());
        
        }
    
        }
}

          
         
            
                    
                   
                  
          
          
          
          
          
          
            }
            
        }
    }
    
}
