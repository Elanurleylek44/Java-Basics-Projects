/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class ornek1 {
    public static void main(String [] args){
        int i=5;
        int j=2;
        int k=enbuyuk(i,j);
        System.out.println(i+"ve"+j+"nin en buyugu"+k+"dir");
    }
    public static int enbuyuk(int sayi1,int sayi2){
        int sonuc;
        if(sayi1>sayi2)
            sonuc=sayi1;
        else
            sonuc=sayi2;
        return sonuc;
                    
        
    }
    
}
