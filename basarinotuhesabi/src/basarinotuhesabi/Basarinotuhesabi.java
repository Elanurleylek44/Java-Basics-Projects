/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package basarinotuhesabi;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class Basarinotuhesabi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int quiz1;
        int  quiz2;
        int odev;
        int vize;
        int Final;
        double basarinotu;
        double yilicinotu;
        
        Scanner input=new Scanner(System.in);
        
        System.out.print("quiz1:");
        quiz1=input.nextInt();
        
        
        System.out.print("quiz2:");
        quiz2=input.nextInt();
        
        System.out.print("odev:");
        odev=input.nextInt();
        
        System.out.print("vize:");
        vize=input.nextInt();
        
        System.out.print("final:");
        Final=input.nextInt();
        
        
        
        yilicinotu=(quiz1*0.1)+(quiz2*0.1)+(odev*0.1)+(vize*0.7);
        basarinotu=(yilicinotu*0.5)+Final*0.5;
        
        if(basarinotu>50){
            System.out.println("gectiniz");
        }else
            System.out.println("kaldiniz");
        }
    }
    

