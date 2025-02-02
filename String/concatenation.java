package String;

public class concatenation {
    public static void main(String[] args) {
        //concatenation
        String firstName = "Deva";
        String lastName = "King";
        String fullName = firstName +" "+ lastName;
        System.out.println(fullName.length());

        for (int i = 0; i < fullName.length(); i++) {
            System.out.println(fullName.charAt(i));
        }

    }
}
