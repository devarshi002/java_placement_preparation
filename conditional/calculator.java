package conditional;
import java.util.*;
public class calculator {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("=====S_i_m_p_l_e C_a_l_c_u_l_a_t_o_r=====");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.print("Enter a value: ");
            int choice = sc.nextInt();

            System.out.println("Enter a first no.: ");
            double num1 = sc.nextDouble();
            System.out.println("Enter the second no: ");
            double num2 = sc.nextDouble();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
            
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Result: " + (num1*num2));
                    break;
                case 4:
                    if(num2!=0){
                        System.out.println("Result: " + (num1/num2));
                    } else {
                        System.out.println("Erroe: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }

    }
}
