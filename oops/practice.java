package oops;

public class practice {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color = "Blue";
        p1.type = "gel";

        p1.write();

        Pen p2 = new Pen();
        p2.color = "Black";
        p2.type = "ballpoint";


        p1.printColor();
        p2.printColor();


    }
}


class Pen {
    String color;
    String type;

    public void write(){
        System.out.println("Writing something.");
    }

    public void printColor() {
        System.out.println(this.color);
        System.out.println(this.type);
    }
}