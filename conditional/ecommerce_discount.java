package conditional;
import java.util.*;
public class ecommerce_discount {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter your total purchase amount: rs");
            double totoalAmount = sc.nextDouble();

            double discount = 0;
            double finalPrice;

            if(totoalAmount > 10000){
                discount = 0.20;
            }
            else if(totoalAmount > 5000){
                discount = 0.10;
            }

            finalPrice = totoalAmount - (totoalAmount * discount);

            if(discount > 0) {
                System.out.println("discount applied: " + (discount*100) + "%");
            } else {
                System.out.println("no discount applied");
            }
            System.out.println("final price: rs" + finalPrice);
        }
    }
}
