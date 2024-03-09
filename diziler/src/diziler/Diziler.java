/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diziler;

import java.util.Arrays;
import org.w3c.dom.ls.LSOutput;

/**
 *
 * @author elale
 */
public class Diziler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int [][]dizi=new int[5][6];
      int sayi=0;
       for(int i=0;i<dizi.length;i++){
           for(int j=0;j<dizi[i].length;j++){
               dizi[i][j]=sayi;
               System.out.print(dizi[i][j]+" ");
               sayi+=2;
        
           }
           System.out.println( );
       }
      
        

    
    
    
   }
}

