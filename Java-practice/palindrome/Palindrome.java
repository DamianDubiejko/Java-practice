import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input string from user
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Close the scanner
        scanner.close();

        // Convert the string to lowercase to make the check case-insensitive
        String original = str.toLowerCase();

        // Reverse the string using StringBuilder
        StringBuilder str1 = new StringBuilder(original);
        str1.reverse();

        // Check if the original string is equal to its reverse
        if (original.equals(str1.toString())) {
            System.out.println("Palindrome String");
        } else {
            System.out.println("Not a palindrome String");
        }
    }
}