/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */


import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author elale
 */
public class DizilerdeKARSILASTIRMA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
	        // Değişken Tanımlaması:
	        int veriTut,veriAra;
	        // Dizi Tanımlaması Gerçekleştirdik:
	        int [] myArray = {14,68,74,2,13,69,84};
	        Arrays.sort(myArray); // Dizimizi Küçükten Büyüğe Sıraladık.
	        System.out.print("Dizi İçerisinde Aramak İstediğiniz Değer: ");
	        veriAra=scanner.nextInt();
	        veriTut = Arrays.binarySearch(myArray,veriAra);
	        System.out.print("-----\n- Dizi Elemanları:");
	        for(int i=0;i<myArray.length;i++){
	            System.out.print("["+myArray[i]+"]");
	        }
	        System.out.println("\n-----");
	        if(veriTut<0)
	            System.out.println("Arama Yaptığınız Değeri Bulamadım.");
	        else
	            System.out.println("Arama Yaptığınız "+veriAra+" Değeri "+veriTut+" İndisinde Bulunuyor.");
	    }
}
    
    

