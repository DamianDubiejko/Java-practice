// Java program to find factorial 
// of given number 

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        s.close(); // Closing the Scanner

        String fact = factorial(n);
        System.out.println("Factorial is " + fact);
    }

    // Method to compute factorial
    public static String factorial(int n) {
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact.toString();
    }
}
