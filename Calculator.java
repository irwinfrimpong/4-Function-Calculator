
/**
 * Write a description of class Calculator here.
 * This calculator will be responsible 
 * for performing operations on numbers
 * entered by the user
 * @author (Irwin Frimpong)
 * @version (8/28/18)
 */

import java.util.Scanner; 
public class Calculator { 
    public static void main (String [] args) {
        // Creating an instance of the Calculator Clas
        Calculator demo = new Calculator(); 
        demo.run(); 
    } 

    public void run () { 
        // Creating a new instance of Scanner 
        Scanner reader= new Scanner(System.in); 
        int amount_of_operations;  //Holds the amount of operations
        String operand= null; // Holds the operand the user would want to use
        float num1,num2,ans; // Variable that holds the number

        // Read line from user input and print out.
        System.out.print("\n Amount of Operations: ");
        amount_of_operations = reader.nextInt();
        if (amount_of_operations <= 0){
            System.out.println("The Number of Arithmatic Operations you have entered is invalid" ) ; 
        }
        else {
            System.out.println("The Amount of Operations computed : " + amount_of_operations);
            // We want to create a for loop that will run the program as many times as the number of operations entered 
            for( int i = 0; i < amount_of_operations; i++) {

                // Ask for the two numbers involved in the computation 
                System.out.print("\n First Number: "); 
                num1= reader.nextFloat(); 

                //Asking for the operation 
                System.out.print("What Operation would you want to take place: \n + means plus \n - means subtract \n * means multiply \n / means divide ");
                operand = reader.next();
                System.out.print("Operator: " + operand ) ; 

                //If statement here to check if the oprand is one of the approved operands

                if (operand.equals("+") || operand.equals("-") ||operand.equals("*") || operand.equals("/") ) {

                    // Asking For Second Number 
                    System.out.print(" \n Second Number: "); 
                    num2= reader.nextFloat(); 

                    // Use switch statement to do the computation 
                    switch (operand) 
                    {
                        case "+" : 
                        ans = num1 + num2 ;
                        System.out.print(ans); 
                        break;

                        case "-" : 
                        ans = num1 - num2 ; 
                        System.out.print(ans); 
                        break;

                        case "*" : 
                        ans = num1 * num2 ; 
                        System.out.print(ans); 
                        break;

                        case "/" : 
                        ans = num1 / num2 ; 
                        System.out.print(ans); 
                        break;
                    }
                } 
                else { 
                    System.out.print( " \n ERROR: You have entered an incorrect operand" ); 
                }

            }
        }
    }
}

