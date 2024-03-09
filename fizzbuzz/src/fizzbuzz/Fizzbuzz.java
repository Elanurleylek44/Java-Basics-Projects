/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fizzbuzz;

/**
 *
 * @author elale
 */
 class nesne {
  
 static void fizzbuzz(){
      for(int i=1;i<101;i++){
          if(i%15==0)
              System.out.print("fizzbuzz");
          else if(i%5==0)
              System.out.print("buzz");
          else if(i%3==0)
              System.out.println("fizz");
          else System.out.print(i+",");
      }
  }
   
    public static void main(String[] args) {
        
        fizzbuzz();
    
}
 }