/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class testvodmetot4 {
    public static void main(String[] args) {
        System.out.println("not degeri:");
        notYazdir(78.5);
        System.out.println("not degeri:");
        notYazdir(59.5);
                
    }
    public static void notYazdir(double dersnotu){
        if(dersnotu>=90.0){
            System.out.println('A');
        }
        else if(dersnotu>=80.0){
            System.out.println('B');
        }
        else if(dersnotu>=70.0){
            System.out.println('C');
                    
        }else{
            System.out.println('F');
                
        }
    }
}
