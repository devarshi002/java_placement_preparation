package oops;

public class OverloadingExample {
    // method with one parameter
    void display(int a) {
        System.out.println("Integer: " + a);
    }

    //method with two parameters
    void display(int a, double b) {
        System.out.println("Integer: " +a + ", Double: "+ b);
    }

    //Method with a different data type
    void display(String str){
        System.out.println("String: "+ str);
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();

        obj.display(10);
        obj.display(10, 20.5);
        obj.display("Hello");
    }
}
