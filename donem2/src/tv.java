/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class tv {
    public static void main(String[]args){
        
        int kanal =1;
        int sesseviyesi=1;
        boolean acik=false;
        
        public tv(){
        }
        public void ac (){
            acik=true;
        }
        public void kapat(){
            acik=false;
        }
        public void setKanal(int yenikanal){
            if(acik&&yeni kanal>=1&&yenikanal<=120)
            kanal=yenikanal;
        }
        public void setses(int yenisesseviyesi<=7){
        sesseviyesi=yenisesseviyesi;
    }
         public void kanalyukarı(){
          if(acik&&kanal<120)
         kanal++;
        }  
        public void kanalasagi(){
         if(acik&&kanal>1)
        kanal--;
       }
       public void sesarttır(){
          if(acik&&sesseviyesi<7)
           sesseviyesi++;
        }
       public void sesazalt(){
     if(acik&&sesseviyesi>1)
      sesseviyesi --;
     }
}
