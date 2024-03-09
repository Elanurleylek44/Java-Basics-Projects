/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class de {
    public static void main(String[] args) {
        
    
    int birinci=1;
    System.out.print(birinci);
    int ikinci=1;
    
        System.out.print(" "+ikinci);
    int yeni;
    for(int i=1;i<24;i++){
        
     yeni=birinci+ikinci;
     birinci=ikinci;
     ikinci=yeni;
            System.out.print(" "+yeni);
    }
}
}
