package DAY16_CW;
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

public class Mainss {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        System.out.println("Sum of 2 integers: " + calc.add(5, 3)); 
        System.out.println("Sum of 2 doubles: " + calc.add(2.5, 3.7)); 
        System.out.println("Sum of 3 integers: " + calc.add(1, 2, 3)); 
    }
}