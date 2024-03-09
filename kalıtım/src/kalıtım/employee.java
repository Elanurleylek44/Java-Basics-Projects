/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalıtım;

/**
 *
 * @author elale
 */
public class employee {
    private String name;

    private String department ;
    
    private int salary;

  
    public employee(String name, String department, int id) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }
           public void showInfos(){
               System.out.println("bigiler...");
               System.out.println("isim"+this.name);
                System.out.println("department"+this.department);
                System.out.println("maaş"+this.salary);
                        
           }
    
}
