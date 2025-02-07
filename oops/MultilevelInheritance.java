package oops;

public class MultilevelInheritance {
    public static void main(String[] args) {
        RightAngledTriangle obj = new RightAngledTriangle();
        obj.area(5, 10);
        obj.display();
    }
}


//parent class

class Shape {
    public void display() {
        System.out.println("this is a shape");
    }
}

//child class (inherits shape)
class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println("Area of triangle: " + (0.5*l*h));
    }
}

//grandchild class (inherits triangle)

class RightAngledTriangle extends Triangle {
    public void displayType() {
        System.out.println("This is a right-Angled Triangle");
    }
}