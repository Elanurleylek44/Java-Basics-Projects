
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package x1;

import java.net.InetSocketAddress;

/**
 *
 * @author elale
 */
public class Hayvan {
    public void  konus(){
        System.out.println("ben konusan bir hayvanım");
    }
    }
class inek extends Hayvan{
    public void konus (){
        System.out.println("mooo");
    }}
class kedi extends Hayvan{
    public void konus (){
        System.out.println("miaww");
    }
}
class kopek extends Hayvan{
    public void konus (){
        System.out.println("hav hav");
    }
    }
    
class Alem{
    public static void main(String []args){ 
        Hayvan[] a=new Hayvan[3];
        a[0]=new kedi();
        a[1]=new kopek();  
        a[2]=new inek();
        
        for(int i=0;i<3;i++)
            a[i].konus();
        
    }
}
    

