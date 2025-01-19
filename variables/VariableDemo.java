package variables;

public class VariableDemo {

    // Instance variable
    int instanceVar = 5;

    // Static variable
    static int staticVar = 10;

    // Method to demonstrate variable usage
    public void display() {
        // Local variable
        int localVar = 20;

        // Display all variables
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    // Main method (program entry point)
    public static void main(String[] args) {
        // Create an object of VariablesDemo to access the instance variable
        VariableDemo obj = new VariableDemo();

        // Call the display method
        obj.display();

        // Access static variable without creating an object
        System.out.println("Accessing Static Variable without object: " + VariableDemo.staticVar);
    }
}
