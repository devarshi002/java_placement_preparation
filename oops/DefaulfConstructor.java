package oops;

public class DefaulfConstructor {
    public static void main(String[] args) {
        Car car1 = new Car();
    }
}


class Car {
    String brand;

    // Default constructor
    Car() {
        System.out.println("Car object is created!");
    }
}