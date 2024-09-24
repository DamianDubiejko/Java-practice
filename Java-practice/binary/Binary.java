import java.util.Scanner;
import java.util.Stack;

public class Binary {

    // Function to convert integer to binary
    static void decimalToBinary(int num) {
        // Handle the case where the input number is 0
        if (num == 0) {
            System.out.println(0);
            return;
        }

        // Creating Stack Object Vector
        Stack<Integer> st = new Stack<>();

        // Number should be positive
        while (num > 0) {
            // Pushing numbers inside stack that
            // are divisible by 2
            st.push(num % 2);
            // Dividing number by 2
            num = num / 2;
        }

        // Checking condition whether stack is empty
        while (!st.isEmpty()) {
            // Printing binary number
            System.out.print(st.pop());
        }
        System.out.println(); // Print new line after binary representation
    }

    // Main driver function
    public static void main(String[] args) {
        // Creating Scanner object to take user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to convert to binary: ");
        int num = scanner.nextInt();
        scanner.close(); // Close the scanner after use

        // Calling the function to convert decimal to binary
        decimalToBinary(num);
    }
}
