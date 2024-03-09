/*
 * 
 */
package javaörnekleri;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class ornek {
    public static void main(String[] args) {
        System.out.println("notunuzu giriniz:");
        Scanner input=new Scanner(System.in);
        int not=input.nextInt();
        if(not>=90){
            System.out.println("AA aldınız");
        }
        else if (not<70){
            System.out.println("FF aldınız");
            
        }
        else if(not>70&&not<80){
           System.out.println("CC aldınız");
            
        }
        else if(not<90&&not>80){
            System.out.println("BB aldınız");
            
        }else{
            System.out.println("gecersiz");
        }
    }
}
