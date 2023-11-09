public class Main {

    public static void main(String[] args) {
        // Demonstrate recursive methods
        System.out.println("Factorial of 5: " + factorial(5));
        System.out.println("Countdown from 5:");
        countdown(5);
        System.out.println("Fibonacci of 5: " + fibonacci(5));
        System.out.println("Sum of numbers up to 5: " + sum(5));
        System.out.println("Power of 2 raised to 3: " + power(2, 3));

        // Demonstrate vehicle and subclasses
        Vehicle car = new Car();
        Vehicle truck = new Truck();
        Vehicle bicycle = new Bicycle();
        Vehicle motorcycle = new Motorcycle();

        car.display();
        truck.display();
        bicycle.display();
        motorcycle.display();
    }

    // Recursive method to calculate factorial
    public static int factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Recursive method to perform countdown
    public static void countdown(int n) {
        if (n < 1) {
            System.out.println("Lift off!");
            return;
        }
        System.out.println(n);
        countdown(n - 1);
    }

    // Recursive method to calculate fibonacci number
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    // Recursive method to calculate sum of numbers
    public static int sum(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sum(n - 1);
    }

    // Recursive method to calculate power
    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * power(base, exponent - 1);
    }
}

// Base class for vehicles
class Vehicle {
    private String type; // private access modifier

    protected void setType(String type) { // protected access modifier
        this.type = type;
    }

    public void display() { // public access modifier
        System.out.println("Vehicle type: " + type);
    }
}

// Subclass for Car
class Car extends Vehicle {
    public Car() {
        setType("Car");
    }
}

// Subclass for Truck
class Truck extends Vehicle {
    public Truck() {
        setType("Truck");
    }
}

// Subclass for Bicycle
class Bicycle extends Vehicle {
    public Bicycle() {
        setType("Bicycle");
    }
}

// Subclass for Motorcycle
class Motorcycle extends Vehicle {
    public Motorcycle() {
        setType("Motorcycle");
    }
}