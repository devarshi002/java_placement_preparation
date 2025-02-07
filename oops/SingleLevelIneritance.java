package oops;

public class SingleLevelIneritance {
    public static void main(String[] args) {
        Triangle obj = new Triangle();
        obj.area(5, 10);
    }
}


class Shape {
    public void area() {
        System.out.println("displays area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(0.5*l*h);
    }
}


//single level inheritance