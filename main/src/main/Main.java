/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author elale
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      employee employee1=new employee("ela", "leylek");
      
      generalManager g1=new generalManager("ela", "gul");
      
        System.out.println("---------------------------\n persomel olusturuldu\n ------");
        employee1.printfo();
        
        
        System.out.println("--------------------\n genel müdür olusturuldu\n----------");
          g1.printfo()
      ;
        System.out.println("------------------");
      
    }
    
}
