
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class deneme {
    public static void main(String[] args) {
  Scanner input=new Scanner(System.in);
  int toplam=0;
  for(int i=1;i<10;i++){
      System.out.println(i+".sayi gir:");
      int sayi=input.nextInt();
      toplam+=sayi;
      
      System.out.println("toplam:"+toplam);
  }
      }
 
    }


 
    

