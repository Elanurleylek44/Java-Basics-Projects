
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class kökbulma {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("a, b,c degerlerini giriniz");
        double a,b,c,x1,x2,delta;
        
        System.out.println("a:");
         a=input.nextDouble();
        System.out.println("b:");
        b=input.nextDouble();
        System.out.println("c");
        c=input.nextDouble();
      
       delta=(b*b)-4*a*c;
       
       if(delta<0){
           System.out.println("gercek kok yoktur");    
       }
       else if (delta==0){
           
           x1=-b/2*a;
           System.out.println("x1=x2"+x1);
       }else{
       x1=(-b+Math.sqrt(delta))/(2*a);
       x2=(-b-Math.sqrt(delta))/(2*a);
           System.out.println("x1:"+x1);
           System.out.println("x2:"+x2);
            
        }
        
    }
    
}
