package String;

public class Compare {
    public static void main(String[] args) {
        String name = "Krishna";
        String name2 = "Shakuni";

        // 1) s1 > s2 : +ve value
        // 2) s1 == s2 : 0
        // 3) s1 < s2 : -ve value

        if (name.compareTo(name2) == 0) {
            System.out.println("String are equal");
        }
        else {
            System.out.println("String are not equal");
        }

        if (new String("Deva") == new String("Deva")) {
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are not equal");
        }
    }
}
