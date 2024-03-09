/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkgfinal.hazırlık;

import java.util.Scanner;

/**
 *
 * @author elale
 */
public class FinalHazırlık {

    
     
     public static void main(String[] args) {
        
      Scanner scan = new Scanner(System.in);
         int[][]a={{1,2,3},{4,5,6},{7,8,9}};
        int[][] b={{1,2,3},{4,5,6},{7,8,9}};
        int[][] c= new int[3][3];
        for (int i=0;i<4;i++){
            for (int j =0;j<3;j++){
                c[i][j]=a[i][j]+b[i][j];
                System.out.println(c[i][j]+" ");

            }
            System.out.println();
        }
    }
}