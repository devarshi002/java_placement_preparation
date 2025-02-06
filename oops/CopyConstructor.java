package oops;

public class CopyConstructor {
    public static void main(String[] args) {
        Car c1 = new Car("Audi");
        Car c2 = new Car(c1);

        c1.Display();
        c2.Display();
    }
}

class Car {
    String brand;

    Car(String b) {
        brand = b;
    }

    Car(Car c) {
        brand = c.brand;
    }

    void Display() {
        System.out.println("car brand: " + brand);
    }
}
