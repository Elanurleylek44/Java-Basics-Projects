
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class taskagıtmakas {
    public static void main(String[] args) {
        String[]nesneler={"tas","kagıt","makas"};
        int prg=(int)(Math.random()*3);
        
        Scanner input=new Scanner(System.in);
        System.out.println("tas:0,kagıt:1,makas:2");
        int sen=input.nextInt();
        System.out.println("program:"+nesneler[prg]);
        System.out.println("sen:"+nesneler[sen]);
        if((prg==0&&sen==1)||(prg==1&&sen==2)||(prg==2&&sen==0))
            System.out.println("sen kazandın");
        else if((prg==0&&sen==2)||(prg==1&&sen==0)||(prg==2&&sen==1))
            System.out.println("kaybettın");
        else{System.out.println("kazanan yok");
        }        
        
        
    }
    
}
