package oops;

public class Example2 {
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.eat();
        myPuppy.bark();
        myPuppy.weep();
    }
}

// grandparent class
class Animal {
    void eat() {
        System.out.println("This animal eats food.");
    }
}

//parent class

class Dog extends Animal {
    void bark() {
        System.out.println("the dog barks.");
    }
}

class Puppy extends Dog {
    void weep() {
        System.out.println("the puppy weeps.");
    }
}

