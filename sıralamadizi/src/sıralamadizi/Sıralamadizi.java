/*+123+65++9*4
78,52,7/9*78
,ü
,-* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sıralamadizi;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author elale
 */
public class Sıralamadizi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[]dizi=new int[20];
        Random rand=new Random();
        Scanner scan=new Scanner(System.in);
        for(int i=0;i<dizi.length;i++){
            dizi[i]=rand.nextInt(1000
        
            
            );
        }
        System.out.println(java.util.Arrays.toString(dizi));
        for(int i=0;i<dizi.length;i++){
            for(int j=1;j<dizi.length;j++){
                if(dizi[j-1]>dizi[j]){
                int temp=dizi[j-1];
                dizi[j-1]=dizi[j];
                dizi[j]=temp;
            }
  
          }
       
        
    }System.out.println(java.util.Arrays.toString(dizi));
    
    
}
}
