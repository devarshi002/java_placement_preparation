package oops;

public class AbstactExample {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start();
        myCar.stop();
    }
}

// abstract class

abstract class Vehicle {
    //abstract method
    abstract void start();

    // concrete methode (has implementation)
    void stop() {
        System.out.println("vehicle is stopping...");
    }
}

// concrete class (provides implementations)

class Car extends Vehicle {
    void start() {
        System.out.println("Car is starting...");
    }
}


