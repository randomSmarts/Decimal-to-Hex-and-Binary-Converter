public class DecimalConverter {

    // Method to convert decimal to binary with a step-by-step explanation for the user.
    public static String toBinary(int decimal) {
        StringBuilder binary = new StringBuilder(); // StringBuilder to build the binary string because it's fancy.
        int number = decimal; // Copy of the original decimal number.

        System.out.println("\nConverting decimal " + decimal + " to binary:");
        // Continue dividing the number by 2 and capturing the remainder (either 0 or 1).
        while (number > 0) {
            int remainder = number % 2;
            binary.insert(0, remainder); // Insert remainder at the start of the string.
            System.out.println(number + " / 2 = " + number / 2 + " remainder " + remainder); // Show division step.
            number = number / 2; // Update number for next iteration.
        }

        // If the number is 0, the binary result is just "0".
        if (binary.isEmpty()) {
            binary.append("0");
        }

        System.out.println("Binary result: " + binary);
        return binary.toString();
    }

    // Method to convert decimal to hexadecimal with a step-by-step explanation for the user.
    public static String toHexadecimal(int decimal) {
        StringBuilder hexadecimal = new StringBuilder(); // StringBuilder to build the hexadecimal string because it's fancy.
        int number = decimal; // Copy of the original decimal number.

        System.out.println("\nConverting decimal " + decimal + " to hexadecimal:");
        // Continue dividing the number by 16 and capturing the remainder (0-9, A-F).
        while (number > 0) {
            int remainder = number % 16;
            String hexChar = Integer.toHexString(remainder).toUpperCase(); // Convert remainder to hex digit.
            hexadecimal.insert(0, hexChar); // Insert hex character at the start of the string.
            System.out.println(number + " / 16 = " + number / 16 + " remainder " + hexChar); // Show division step.
            number = number / 16; // Update number for next iteration.
        }

        // If the number is 0, the hexadecimal result is just "0".
        if (hexadecimal.isEmpty()) {
            hexadecimal.append("0");
        }

        System.out.println("Hexadecimal result: " + hexadecimal);
        return hexadecimal.toString();
    }
}