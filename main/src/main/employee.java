/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author elale
 */
public class employee {
    String isim,soyad,bolum="calisan",calismaBilgileri;
    int  izinGunu=30;
    double maas=30000;
    
    //yapici metot tanımlaömasi

    employee(String isim, String soyad) {
        this.isim = isim;
        this.soyad = soyad;
    }
    void printfo(){
        calismaBilgileri="isim ve soyisim:"+isim+""+soyad+"\n-> bolum:"+bolum+"\n izin günü"+izinGunu+"gun"+"\n>- maas:"+maas+"tl";
        System.out.println(calismaBilgileri);
                
        
    }
    
    
}
