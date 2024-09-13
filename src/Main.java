import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Create a Scanner object to take user input from the terminal.
        Scanner scanner = new Scanner(System.in);
        String continueOption = null; // Variable to control the continuation of the program

        System.out.println("=== Decimal to Binary and Hexadecimal Converter ===");

        do {
            try {
                // Step 1: Ask the user to enter a decimal number.
                System.out.print("\nEnter a decimal number: ");
                int decimal = scanner.nextInt();  // This reads the input from the user.

                // Step 2: Check if the input is a non-negative integer.
                if (decimal < 0) {
                    // If the number is negative, print an error message.
                    System.out.println("Error: Please enter a non-negative number.");
                } else {
                    // Step 3: Convert the decimal number to binary with step-by-step output (in DecimalConverter.java).
                    String binary = DecimalConverter.toBinary(decimal);

                    // Step 4: Convert the decimal number to hexadecimal with step-by-step output (in DecimalConverter.java).
                    String hexadecimal = DecimalConverter.toHexadecimal(decimal);

                    // Step 5: Display the final results.
                    System.out.println("\n=== Final Conversion Results ===");
                    System.out.println("Decimal:      " + decimal);   // Original decimal input.
                    System.out.println("Binary:       " + binary);    // Binary conversion result.
                    System.out.println("Hexadecimal:  " + hexadecimal); // Hexadecimal conversion result.
                }
            } catch (Exception e) {
                // Step 6: If there is any invalid input (like a non-integer), show an error message.
                System.out.println("Error: Invalid input. Please enter a valid integer.");
                scanner.next(); // Clear the invalid input from the scanner
            }

            // Step 7: Ask the user if they want to continue with another conversion.
            boolean validResponse = false; // Variable to ensure valid response
            while (!validResponse) {
                System.out.print("\nDo you want to convert another number? (yes/no): ");
                continueOption = scanner.next();  // Read the user's decision.

                // Check if the user input is "yes" or "no".
                if (continueOption.equalsIgnoreCase("yes")) {
                    validResponse = true; // Exit this loop if valid response.
                } else if (continueOption.equalsIgnoreCase("no")) {
                    validResponse = true; // Exit this loop if valid response.
                } else {
                    // Prompt the user again if the response is invalid.
                    System.out.println("Invalid input. Please enter 'yes' or 'no'.");
                }
            }

        } while (continueOption.equalsIgnoreCase("yes")); // Loop continues until the user types "no".

        // Step 8: Thank the user because its kind and then end the program.
        System.out.println("Thank you for using the converter!");
        scanner.close(); // Close the scanner to prevent resource leaks because no one wants that.
    }
}