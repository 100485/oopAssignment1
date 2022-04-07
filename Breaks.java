/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author msarbie
 */
public class Breaks {
    
    public static void main(String[] args) {
        
        // unlabelled
        int firstCounter = 0;
        int secondCounter = 0;
        int n = 4;
        
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n; j++) {
                if(j == 2) {
                    break;
                }
                firstCounter++;
                System.out.println("[" + i + ", " + j +"]");
            }
        }
        
        System.out.println("\n\n");
        
        // labeled
        outerloop:
        for(int i = 0; i <= n; i++) {
            for(int j = 0; j <= n; j++) {
                if(j == 4) {
                    break outerloop;
                }
                secondCounter++;
                System.out.println("[" + i + ", " + j + "]");
            }
        }
        
        System.out.println();
        System.out.println("firstCounter: " + firstCounter);
        System.out.println("secondCounter: " + secondCounter);
        
    }
    
}
