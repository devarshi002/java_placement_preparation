package loop;
import java.util.*;
public class ecommerce_cart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of items in your cart: ");
        int numItems = sc.nextInt();

        double totoalAmount = 0;
        double itemPrice;


        //using for loop to get the price of each item and calculate the total
        for (int i=1; i <= numItems; i++){
            System.out.println("Enter price of item " + i + " : rs");
            itemPrice = sc.nextDouble();
            totoalAmount += itemPrice;
        }
        double discount = 0;
        if (totoalAmount > 10000){
            discount = 0.20;
        }
        else if (totoalAmount > 5000){
            discount = 0.10;
        }

        double finalAmount = totoalAmount - (totoalAmount * discount);

        System.out.println("Total Price: rs" + totoalAmount);
        System.out.println("Discount Applied: " + (discount * 100) + "%");
        System.out.println("Final Price after Discount: rs" + finalAmount);

        sc.close();
    }
}
