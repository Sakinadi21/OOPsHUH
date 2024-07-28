package Fraction;

public class fraction {

    // Static nested class to represent a fraction
    public static class Fraction {
        int num; // numerator
        int den; // denominator

        // Constructor to initialize the numerator and denominator
        public Fraction(int num, int den) {
            this.num = num;
            this.den = den;
        }

        // Method to simplify the fraction
        public void simplify() {
            // Find the greatest common divisor (GCD) using the Euclidean algorithm
            int gcd = gcd(num, den);
            // Divide both numerator and denominator by the GCD to simplify the fraction
            num = num / gcd;
            den = den / gcd;
        }

        // Helper method to calculate the GCD of two numbers
        private int gcd(int a, int b) {
            if (b == 0) {
                return a;
            }
            return gcd(b, a % b);
        }
    }

    public static void main(String[] args) {
        // Create a new Fraction object with numerator 3 and denominator 7
        Fraction f1 = new Fraction(3, 7);
        // Print the original fraction
        System.out.println(f1.num + "/" + f1.den);
        // Simplify the fraction
        f1.simplify();
        // Print the simplified fraction
        System.out.println(f1.num + "/" + f1.den);

        // Create another Fraction object with numerator 7 and denominator 7
        Fraction f2 = new Fraction(7, 7);
        // Print the original fraction
        System.out.println(f2.num + "/" + f2.den);
        // Simplify the fraction
        f2.simplify();
        // Print the simplified fraction
        System.out.println(f2.num + "/" + f2.den);
    }
}
