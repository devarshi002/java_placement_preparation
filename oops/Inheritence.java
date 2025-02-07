package oops;

public class Inheritence {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";        
    }
}


class Shape {
    String color;
}

class Triangle extends Shape {

}
