/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animal;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Reptile  {
    
    double bloodTemp;
    
   Reptile rept = new Reptile();


  public double Reptile() {
        
       this.bloodTemp = 30.44;
       return bloodTemp;
          }  

  
    
   public void input() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter blood temperature: ");
        bloodTemp = scanner.nextDouble();
    }
   
    
  public void output() {
        
        System.out.println("Blood temperature: " + bloodTemp);
    }  
  
  
}
  