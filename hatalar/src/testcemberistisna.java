/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class testcemberistisna {
    public static void main(String[] args) {
        try{
            cemberistisna c1=new cemberistisna(5);
            cemberistisna c2=new cemberistisna(-5);
            cemberistisna c3=new cemberistisna(0);
        }
        catch (IllegalArgumentException ex){
            System.out.println(ex);
        }
        System.out.println("olusturukan nesne sayisi:"+cemberistisna.getnesneSayisi());
            
    
    }
    }
    

