// Parent class (Base Class)
class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Cannot divide by zero!");
            return 0;
        }
        return a / b;
    }
}

// Child class (Subclass)
class AdvancedCalculator extends Calculator {

    // Additional function: Power
    public double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Additional function: Modulus
    public double modulus(double a, double b) {
        return a % b;
    }
}

// Main class to run the program
public class CalculatorDemo {
    public static void main(String[] args) {

        AdvancedCalculator calc = new AdvancedCalculator();

        double a = 12;
        double b = 4;

        System.out.println("===== CALCULATOR USING INHERITANCE =====");
        System.out.println("Numbers: " + a + ", " + b);

        System.out.println("Addition: " + calc.add(a, b));
        System.out.println("Subtraction: " + calc.subtract(a, b));
        System.out.println("Multiplication: " + calc.multiply(a, b));
        System.out.println("Division: " + calc.divide(a, b));
        System.out.println("Power (a^b): " + calc.power(a, b));
        System.out.println("Modulus (a % b): " + calc.modulus(a, b));
    }
}


