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
public class Bird  {
    int colour;
    
    Bird brd = new Bird();
    
      public void Bird() {
        
        this.colour = 1;
        
        
    }
      
       public void input() {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter feather colour (1=grey, 2=white, 3=black): ");
        colour = scanner.nextInt();
    }
    
       public void output() {
        
        System.out.println("Feather colour: " + colour);
    }
}

