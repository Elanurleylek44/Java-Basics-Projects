/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */
public class odev1 {
    public static void main(String[] args) {
      String yazi1="yazılım Mühendisliği";
      String yazi2="Çok çalışmalıyız";
      for(int i=1;i<10000;i++){
          if(i%2==1){
              System.out.println(yazi1+" -"+i);
          }
          for(int j=i+1;j<10000;j++){
          if(j%2==0){
              System.out.println(yazi2+" -"+j);
          }
          break;
      }
      }  
    }
}
