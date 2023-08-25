/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Animal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
    
    
   Bird brd = new Bird();
       Reptile rept = new Reptile();
       

        System.out.println("Enter bird details:");
        brd.input();
        System.out.println("Enter reptile details:");
        rept.input();

        System.out.println("Bird details:");
        brd.output();
        System.out.println("Reptile details:");
        rept.output();
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            

        }
   int IDtag;
   String species;
    
    
    
    public Animal(int IDtag, String species) {
        this.IDtag= IDtag;
        this.species = species;
        
    }
    
    
    
     public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ID tag: ");
        int IDtag = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter species: ");
        String species = scanner.nextLine();
    }
    
     public void output() {
        System.out.println("ID tag: " + IDtag);
        System.out.println("Species: " + species);
    }
     
     
   
      
}
