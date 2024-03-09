/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hayvan;

import javax.print.attribute.standard.JobImpressions;

/**
 *
 * @author elale
 */
public class Hayvan {

   public void konus(){
   System.out.println(" bir hayvanım");
   }
}

class inek extends Hayvan{
public void konus(){
    System.out.println("möö");
}
}
class kedi extends Hayvan{
 public void konus(){
    System.out.println("miaw");
    
}
}
class alem{
public static void main(String []args){
Hayvan [] a =new Hayvan[3];
a[0]=new kedi();
        a[1]=new inek();
        for(int i=0;i<3;i++)
            a[i].konus();
}
}
