/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
import javax.swing.JOptionPane;
public class guı {
    public static void main(String args[]){
        String name = JOptionPane.showInputDialog("adınızı giriniz:");
        JOptionPane.showMessageDialog(null,"     merhaba     "+name);
        
        int age =Integer.parseInt(JOptionPane.showInputDialog("yasinizi giriniz:"));
        JOptionPane.showMessageDialog(null,"   "+age+"    yasindayim");
    
    
    }
}
