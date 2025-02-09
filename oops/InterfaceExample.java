package oops;

public class InterfaceExample {
    public static void main(String[] args) {
        Animal myDog = new Dog();
        myDog.sound();
    }
}


// define interface

interface Animal {
    void sound();
}

//implementing the interface
class Dog implements Animal {
    public void sound() {
        System.out.println("Dog barks...");
    }
}