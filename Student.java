/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author msarbie
 */
import java.util.Scanner;


public class Student {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter your full name:");
        String fullName = scanner.nextLine();
        
        int counter = 0;
        int numberOfUnits = 5;
        
        String[] subjects = new String[numberOfUnits];
        double[] marks = new double[numberOfUnits];
        
        System.out.println("\nEnter 5 subjects and corresponding marks :\n");
        
        do {
            
            System.out.println("\nEnter subject name:");
            String subject = scanner.nextLine();
            
            System.out.println("Marks for " + subject + ": ");
            // Double mark = scanner.nextDouble();
            String mark = scanner.nextLine();
            
            subjects[counter] = subject;
            // marks[counter] = mark;
            marks[counter] = Double.parseDouble(mark);
            
            counter++;
            
        } while(counter < numberOfUnits);
        
        // output
        System.out.println("\nSTUDENT DETAILS:");
        System.out.println("Name: " + fullName);
        
        System.out.println("\nSUBJECT\tSCORE");
        for(int i = 0; i < subjects.length; i++) {
            System.out.println(subjects[i] + ":\t" + marks[i]);
        }
        
    }
    
    
    
}
