package oops;

public class ParameterizedConstructor {
    public static void main(String[] args) {
        Car c1 = new Car("tesla");
        c1.Display();
    }
}


class Car {
    String brand;

    //Parameterized Constructor
    Car(String b) {
        brand = b;
    }

    void Display() {
        System.out.println("Car Brand: " + brand);
    }
}

