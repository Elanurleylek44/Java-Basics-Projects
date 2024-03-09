
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class main {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        
        System.out.println("what is your name?");
        String name=input.nextLine();
        System.out.println("hello " +name);
        System.out.println("how old are you?");
        int old=input.nextInt();
        System.out.println("your age is"+old);
    }
    
}
