/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sinava_hazirlik;

/**
 *
 * @author elale
 */
public class deneme {
    public static void main(String[] args) {
        int[] liste = {1, 2, 3, 4, 5, 6};
for (int i = 1; i < liste.length; i++)
liste[i] = liste[i - 1];
for (int i = 0; i < liste.length; i++)
System.out.print(liste[i] + " ");

    }
    
}
