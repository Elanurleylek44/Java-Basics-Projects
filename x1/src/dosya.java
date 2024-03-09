
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class dosya {
    public static void main(String[] args)throws FileNotFoundException {
        File elanur =new File("C:\\Users\\elale\\OneDrive\\Masaüstü\\fileReader-dosya-elanur.txt");
        if(elanur.exists()){
            System.out.println("dosya yok!");
        }else{
            System.out.print("dosya var");
        }
        
    }
                
}





