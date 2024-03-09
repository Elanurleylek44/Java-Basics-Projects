













import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */

public class Kitap {
    
    protected  String kitapAdi,yazar;
    protected  int sayfaSayisi;

    public Kitap(String kitapAdi, String yazar, int sayfaSayisi) {
        this.kitapAdi = kitapAdi;
        this.yazar = yazar;
        this.sayfaSayisi = sayfaSayisi;
        
        if(sayfaSayisi<1){
            this.sayfaSayisi=10;
            
        }else{
             this.sayfaSayisi=sayfaSayisi;
            
        }
    }
    
    public  int getSayfaSayisi(){
        return this.sayfaSayisi;
        
    }
    
    public void setSayfaSayisi(int sayfaSayisi){
        this.sayfaSayisi=sayfaSayisi;
        
    }
    
    
    

    
    
}
