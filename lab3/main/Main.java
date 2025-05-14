package main;

import complex.Complex;

public class Main {
    public static void main(String[] args) {
        // Create two Complex objects
        Complex c1 = new Complex(1, 2);
        Complex c2 = new Complex(1, 2);

        // Print the Complex objects
        System.out.println("c1: " + c1); // Output: 3+4i
        System.out.println("c2: " + c2); // Output: 1-2i

        // Add the Complex objects
        Complex sum = c1.add(c2);
        System.out.println("Sum: " + sum); // Output: 4+2i

        // Subtract the Complex objects
        Complex difference = c1.subtract(c2);
        System.out.println("Difference: " + difference); // Output: 2+6i

        // Multiply the Complex objects
        Complex product = c1.multiply(c2);
        System.out.println("Product: " + product); // Output: 11-2i

        // Test identity (==)
        System.out.println("c1 == c2: " + (c1 == c2)); // Expected: false

        // Test equality (equals)
        System.out.println("c1.equals(c2): " + c1.equals(c2)); // Expected: true

        // Test hashCode
        System.out.println("c1.hashCode() == c2.hashCode(): " + (c1.hashCode() == c2.hashCode())); // Expected: true
    }
}
