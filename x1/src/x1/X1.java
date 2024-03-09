/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package x1;

import javax.swing.text.JTextComponent;
import org.w3c.dom.ls.LSOutput;

/**
 *
 * @author elale
 */
public class X1 {

    public static void main(String[] args) {
        
        Hayvan []a=new Hayvan[3];
        a[0]=new kedi();
        a[1]=new kopek();
        a[2]=new inek();
        
        for(int i=0;i<3;i++){
            a[i].konus();
            if(a[i] instanceof kopek)
            System.out.println("kopektir");
        }
            
    }
    
}
