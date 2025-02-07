package oops;

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.area(5, 10);

        Rectangle r1 = new Rectangle();
        r1.area(5, 10);
    }
}

//parent class

class Shape {
    public void display() {
        System.out.println("This is a shape");
    }
}

// child class 1 (inherits Shape)

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println("Area of triangle: " + (0.5 * l * h));
    }
}

// child class 2 (inherits Shape)

class Rectangle extends Shape {
    public void area(int l, int b){
        System.out.println("Area of rect: " + (l*b));
    }
}