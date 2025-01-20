package conditional;
import java.util.*;

public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a password to validate: ");
        String password = sc.nextLine();

        if (isValidPassword(password)) {
            System.out.println("Password is valid!");
        } else {
            System.out.println("Password is invalid! Ensure it meets the following rules:");
            System.out.println("- At least 8 characters long.");
            System.out.println("- Contains at least one uppercase letter.");
            System.out.println("- Contains at least one lowercase letter.");
            System.out.println("- Contains at least one number.");
        }

        sc.close(); // Always close the scanner to prevent resource leaks
    }

    // Method to validate the password
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }

        boolean hasUppercase = false;
        boolean hasLowercase = false;
        boolean hasDigit = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUppercase = true;
            } else if (Character.isLowerCase(ch)) {
                hasLowercase = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }

            // If all conditions are met, no need to check further
            if (hasUppercase && hasLowercase && hasDigit) {
                return true;
            }
        }
        return false;
    }
}
