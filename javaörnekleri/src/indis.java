/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class indis {
    public static void main(String[] args) {
         System.out.println("                Tablo İndisleri ve İndis Toplamlari ");
         System.out.println("              ");
        for(int i=1;i<=9;i++)
            System.out.print("   "+i);
            System.out.println("\n----------------------------------------------------");
            
            for(int j=1;j<=9;j++){
                System.out.print(j+"|");
                
            
                for(int i=1;i<=9;i++){
                       System.out.printf("     %d%d",i,j," ",i+j);
                       System.out.print("-");
                       System.out.print(i+j);
    
            }  
            System.out.println();
}
 }
}

