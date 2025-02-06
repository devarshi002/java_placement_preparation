package oops;

public class practice {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.type = "gel";

        p1.write();


    }
}


class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing something.");
    }
}