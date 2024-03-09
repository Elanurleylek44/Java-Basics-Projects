/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package donem2;

/**
 *
 * @author elale
 */
public class Donem2 {

  
      public static int top(int a,int b){
          int sonuc =0;
          for(int i=a;i<=b;i++)
              sonuc+=i;
          return sonuc;
      }
    public static void main(String[] args) {
        // TODO code application logic here
       //ü, System.out.println("1den 12 ye kadar toplam"+top(1, 12));
       // System.out.println("10dan 20ye kadar"+top(10,20 ));
        System.out.println(top(1, 10));
        
    }
    
}
