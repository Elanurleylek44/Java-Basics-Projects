/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author elale
 */

    class Circle{
        double radius=1;

         Circle() { 
         }
             Circle(double newRadius){
             radius =newRadius;
             
                     
         }
             double getArea(){
             return radius*radius*Math.PI;
         }
             double getPerimeter(){
                 return 2*radius*Math.PI;
           
         }
             double setRadius(double newRadiuds){
                 radius=newRadiuds;
            return 5;
             
             }
        }
    

    
    
}
