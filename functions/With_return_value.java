package functions;

public class With_return_value {
    
    public static int multiply(int x, int y){
        return x * y;
    }
    
    
    
    public static void main(String[] args) {
        int result = multiply(4, 5);
        System.out.println("result: " + result);
    }
}
