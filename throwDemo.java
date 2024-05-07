//We specify the exception object which is to be thrown
//We can throw either checked or unchecked exceptions in Java by throw keyword
//Throw is used within the method.You cannot throw multiple exceptions.

import java.util.Scanner;

public class throwDemo {
    // function to check if person is eligible to vote or not
    public static void validate(int age) {
        if (age < 18) {
            // throw Arithmetic exception if not eligible to vote
            throw new ArithmeticException("Person is not eligible to vote");
        } else {
            System.out.println("Person is eligible to vote!!");
        }
    }
    public static void main(String args[]) {
        // Create Scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        try {
            // calling the function with user input age
            validate(age);
            System.out.println("Rest of the process for voting ...");
        } catch (ArithmeticException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}


