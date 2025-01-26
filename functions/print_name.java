package functions;

import java.util.Scanner;

public class print_name {
    
    public static void my_name(String name){
        System.out.println(name);
        return;
    }
    
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next();

            my_name(name);
        }
    }
}
