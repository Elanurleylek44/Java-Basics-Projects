/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursive;

/**
 *
 * @author elale
 */
public class Recursive {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        int sonuc=toplam(10);
        System.out.println(sonuc);
    }
    public static int toplam (int k){
        if (k>0){
            return k+toplam(k-1);
            
        }
        else{
            return 0;
        }
    }
    
}
