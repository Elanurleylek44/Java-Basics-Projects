
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.print.attribute.ResolutionSyntax;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class inputmismatchexceptiondemo {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        boolean giriseDevamEt=true;
         
        do{
            try{
                System.out.println("bir tam sayi giriniz:"); 
                int number =input.nextInt();
                 
                System.out.println("girilen sayi"+number+"dir");
                
                giriseDevamEt=false;
            }
                
                catch(InputMismatchException ex){
                       System.out.println("tekrar deneyin ."
                        + "bir tam sayi gerekiyor");
                        input.nextLine();
                        }
        }while(giriseDevamEt);
        
            }
        }
        
    
    

