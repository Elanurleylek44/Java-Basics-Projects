/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class ders2ornek1{
    public static void main(String []args){
        //yarıcapı 1 oolan cember olusturma
        BasitCember cember1=new BasitCember();
        System.out.println("yaricapı"+cember1.yaricap+"olan cemberin alanı:"+cember1.getAlan());
        
        
        
        //yaricapı 25 olan cember olusturma
       BasitCember cember2=new BasitCember(25);
        System.out.println("yaricapı"+cember2.yaricap+"olan cemberin alanı:"+cember2.getAlan());
        
        
    }
}
