package oops;


public class ConstructorOverloading {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("BMW", 5500000);

        car1.Display();
        car2.Display();
    }
}


class Car {
    String brand;
    int price;

    //default
    Car() {
        brand = "unknown";
        price = 0;
    }

    //parameterized
    Car(String b, int p){
        brand = b;
        price = p;
    }

    void Display() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }


}