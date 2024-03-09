
import javax.print.attribute.standard.MediaSize;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class A {
    int i=5;
    static int k=2;
    
    public static void main(String[] args) {
        m2(3, 4);
    }
   public  void m1(){
       i=i+k+m2(i,k);
   }
    
   public static int m2(int i,int j){
       return (int)(Math.pow(i,j    ));
        
    }
    
}
   