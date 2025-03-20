import java.util.Scanner;

public class NumberClassifierMenu {
    public static void main(String[] args) {
        // Use try-with-resources to automatically close the Scanner
        try (Scanner input = new Scanner(System.in)) {
            char userChoice; // Declare the userChoice variable here

            do {
                // Print menu
                System.out.println("\n=== Number Classifier Menu ===");
                System.out.println("1. Classify a number as positive, negative, or zero");
                System.out.println("2. Print a multiplication table for a given number");
                System.out.println("3. Exit");
                System.out.print("Enter your choice (1-3): ");
                
                int choice = input.nextInt();  // User selects menu option
                
                // Using rule switch (Java 12 or later)
                String result = switch (choice) {
                    case 1 -> {
                        // Option 1: Classify a number
                        System.out.print("Enter a number to classify: ");
                        int number = input.nextInt();
                        
                        // Classify the number
                        if (number > 0) {
                            System.out.println("The number " + number + " is positive.");
                        } else if (number < 0) {
                            System.out.println("The number " + number + " is negative.");
                        } else {
                            System.out.println("The number is zero.");
                        }
                        
                        // Check if the number is even or odd
                        if (number % 2 == 0) {
                            System.out.println("It is also an even number.");
                        } else {
                            System.out.println("It is an odd number.");
                        }
                        yield "Option 1 selected";  // Return statement for this case
                    }
                    case 2 -> {
                        // Option 2: Print a multiplication table
                        System.out.print("Enter a number to display its multiplication table: ");
                        int tableNumber = input.nextInt();
                        System.out.println("Multiplication Table for " + tableNumber + ":");
                        for (int i = 1; i <= 10; i++) {
                            System.out.println(tableNumber + " x " + i + " = " + (tableNumber * i));
                        }
                        yield "Option 2 selected";  // Return statement for this case
                    }
                    case 3 -> "Exiting the program. Goodbye!";  // Option 3: Exit the program
                    default -> "Invalid option. Please choose between 1 and 3.";  // Default case for invalid option
                };
                
                // Print the result after performing the selected operation
                System.out.println(result);
                
                // Ask if the user wants to return to the menu
                System.out.print("Do you want to return to the menu? (Y/N): ");
                input.nextLine(); // Consume newline left by nextInt()
                userChoice = input.nextLine().toUpperCase().charAt(0); // Capture the user's choice
                
            } while (userChoice == 'Y');  // Continue if the user enters 'Y'
            
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
