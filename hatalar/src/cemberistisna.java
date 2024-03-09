/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class cemberistisna {
      private double yaricap;
      
      private static int nesneSayisi=0;
      
      /**1 yaricaplı cember yapilandir
       * 
       */
    
      public cemberistisna(){
          this(1.0);
      }
      
      //belirtilen yaricapla cember yapılandırıldı
      public cemberistisna(double yeniYaricap ){
          setyaricap(yeniYaricap);
          nesneSayisi ++;
      }
      
      public double getYaricap(){
          return yaricap;
      }
      public void settYaricap(double yeniYaricap)
              throws IllegalArgumentException{
          if(yeniYaricap>=0){
              yaricap=yeniYaricap;
          }
          else {
              throw new IllegalArgumentException("yaricap negatif olamaz");
          }
      }
    /**
     *
     * @return
     */
    public static int getnesneSayisi(){
          return nesneSayisi;
      }
      
public double alanHesapla(){
    return yaricap*yaricap*3.1459;
}

          
      
}
