/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class fibo {
    public static void main(String[] args) {
        int birinci=1;
        System.out.println(birinci);
        int ikinci=1;
        System.out.println(ikinci);
        int yeni;
        for(int i=1;i<12;i++){
            yeni=birinci+ikinci;
        birinci=ikinci;
        ikinci=yeni;
            System.out.print(yeni);
        
        
    }
    }
}
