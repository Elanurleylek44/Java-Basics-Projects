
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class test1 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        //0girene kadar sayı yaz 0 girilince sayılardan en buyugunu yazdıran program
        System.out.println("TAM SAYILAR GİRİNİZ 0GİRİLİNCE PROGRAM DURAcak ");
        int number,max;
        number=input.nextInt();
        max=number;
        
        while(number!=0){//girilen sayı sıfır değil iken sayı girdisi almaya devam ediyor
        number =input.nextInt();
        if(number>max)
            max=number;
        
    }
        System.out.println("max is"+max);
        System.out.println("number"+number);
   }
}