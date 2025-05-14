package complex;

import java.util.Objects;

/****
 * This class represents a complex number with real and imaginary parts.
 * It provides methods for addition, subtraction, multiplication, and string representation.
 * It also overrides the equals method to compare complex numbers based on their values.
 * @author dantunes
 */

public class Complex {
    private final int real; 
    private final int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imaginary + other.imaginary);
    }

    public Complex subtract(Complex other) {
        return new Complex(this.real - other.real, this.imaginary - other.imaginary);
    }

    public Complex multiply(Complex other) {
        return new Complex(this.real * other.real - this.imaginary * other.imaginary,
                this.real * other.imaginary + this.imaginary * other.real);
    }

    @Override
    public String toString() {
        if (imaginary >= 0) {
            return real + "+" + imaginary + "i";
        } else {
            return real + "" + imaginary + "i";
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Check if both references are the same
        if (obj == null || getClass() != obj.getClass()) return false; // Check type compatibility
        Complex other = (Complex) obj; // Cast to Complex
        return this.real == other.real && this.imaginary == other.imaginary; // Compare values
    }

    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary); // Generate hash code based on real and imaginary
    }
}