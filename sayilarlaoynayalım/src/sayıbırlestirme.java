/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class sayıbırlestirme {
    public static void main(String[] args) {
        System.out.println("        carpim tablosu indisleri");
        System.out.println("      ");
         for (int j=1; j<=9; j++) 
            System.out.print("  "+j);
         System.out.println("   \n-------------------------------------");
         
         for (int i=1;i<=9;i++){
             System.out.print(i+"|");
             for(int j=1;j<=9;j++){
                 System.out.printf(" %d%d",i,j);
                 
             }
             System.out.println();    
         }
    }
}

                
                 
    
    

