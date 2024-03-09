/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.fibonacciidizisi;

/**
 *
 * @author elale
 */
public class Fibonacciidizisi {

    public static void main(String[] args)
    {
        int a=1,b=1,c=1 ;
       System.out.print( a+","+b );
       for (int i=1; i<25;i++) 
            
           c=a+b;
        System.out.print(","+c);
        
        
        a=b;
        b=c;
          }
           
       }

