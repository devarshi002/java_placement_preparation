package oops;

public class Exaample1 {
    public static void main(String[] args) {
        Dog myDog = new Dog();
        myDog.eat();
        myDog.bark();
    }
}


// parent class

class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

//child class

class Dog extends Animal {
    void bark() {
        System.out.println("The dog barks.");
    }
}