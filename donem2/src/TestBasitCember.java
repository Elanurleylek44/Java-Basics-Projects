
import java.util.PropertyResourceBundle;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */

    class BasitCember{
        double yaricap;

     BasitCember() {
    
       
        
        yaricap =1;
        }
     //yaricapi belirlenebilen bir cember  yapilandir
         BasitCember(double yeniicap) {
            yaricap=yeniicap;
            
        }
         //bu cemberin alanını geri döndür
         double getAlan(){
             return yaricap*yaricap+Math.PI;
             
         }
         //bu cemberin cevresini geri döndür
         double getCevre(){
            return 2*yaricap*Math.PI;
         }
         void setYaricap(double yeniicap){
             yaricap=yeniicap;
         }
    }
                
                       
    
   
