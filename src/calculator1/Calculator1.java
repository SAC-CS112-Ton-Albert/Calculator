/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator1;

import java.util.Scanner;
/**
 *
 * @author albertton
 */
public class Calculator1 {
    
   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
    
    int x;
    int y;
    
    System.out.print("Enter first integer:");
    x = input.nextInt();
    
    System.out.print("Enter second integer:");
    y = input.nextInt();
    
    int sum = x + y; //sum
    int difference = x - y; //difference
    int product = x * y; //mutiplies
    int quotient = x / y; //divides
    
    System.out.printf("Sum is %d\n", sum);
    System.out.printf("Difference is %d\n", difference);
    System.out.printf("Product is %d\n", product);
    System.out.printf("Quotient is %d\n", quotient);
    
            
    
    
            
    
        // TODO code application logic here
    }
    
    //Got it...make sure to publish the URL in blackboard. Thanks
}
// Got it.  Please make sure to update blackboard with the URL
