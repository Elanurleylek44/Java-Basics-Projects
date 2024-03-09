
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class test {
    public static void main(String[] args) {
       int m=5,n=4;
        System.out.print ("!!!!");
        for(int j=1;j<=n;j++)
            System.out.print("!!!"+j);
        System.out.println();
        
        for(int j=1;j<=n+1;j++)
           System.out.print("----");
        System.out.println( );
        
        for(int i=1;i<=m;i++){
            System.out.print (i+">**");
            for(int j=1;j<=n;j++)
                System.out.printf("-%d0%d",i,j);
            System.out.println();
        }
        }
          
                
        
             
             
           
               
               
     
        
    
}
}