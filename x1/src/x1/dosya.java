/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package x1;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author elale
 */
public class dosya {
    public static void main(String[] args)  {
        File enerji=new File("enerji.txt");
        
        try{
        
        if(enerji.createNewFile()){
            System.out.println("enerji olusturuldu");
            FileWriter  writer=new FileWriter(enerji);
            writer.write("yedimdeki gibi 20mdeyim");
             writer.write("bilegim pekde güclu degii\n");
              writer.write("degismedi icimdeki masum peri ama\n");
               writer.write("ama kovaladım her gün daha deli\n");
                writer.write("aaaaaaaaaaaaaa inan ama neye dua ettim her gece aaaaaaaaaa\n");
      
                writer.close();
        }
        else{
            System.out.println("enerji zaten olusturuldu");
            
            // dosya içeriğini değiştirme işlemi
           
            FileReader filereader=new FileReader(enerji);
            StringBuilder fileContent=new StringBuilder();
            int character;
            
       
            //dosyanın içeriğini degistirme
            
            fileContent.append("\n yeni bir satir eklemek icin metin");
            
            // dosyayı tekrar yama işlemi
            
            FileWriter filewriter=new FileWriter(enerji);
            filewriter.write(fileContent.toString());
            filewriter.write("kendimi bunun için mi yorucam bennn\n");
             filewriter.write("kalbimi bunun için mi kırıcam benn\n");
             
            
            filewriter.close();
            System.out.println("dosya icerigi güncellendi");
        }
    
                
        }  catch(IOException e){
                System.out.println("enerji bulunamadı" +e.getMessage() );
                }
    }
    
}
