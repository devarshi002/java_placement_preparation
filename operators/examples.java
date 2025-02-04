package operators;

public class examples {
        public static void main(String[] args) {
            int a = 10, b = 5;
            
            // Arithmetic Operators
            System.out.println("Addition: " + (a + b));
            System.out.println("Subtraction: " + (a - b));
    
            // Relational Operators
            System.out.println("Is a greater than b? " + (a > b));
    
            // Logical Operators
            System.out.println("Logical AND: " + (a > 5 && b < 10));
    
            // Bitwise Operators
            System.out.println("Bitwise AND: " + (a & b));
    
            // Assignment Operators
            a += 5;
            System.out.println("New value of a: " + a);
    
            // Unary Operators
            System.out.println("Pre-increment: " + (++b));
    
            // Ternary Operator
            int min = (a < b) ? a : b;
            System.out.println("Minimum value: " + min);
        }
    
}
