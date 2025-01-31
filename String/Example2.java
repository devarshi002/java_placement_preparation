package String;

public class Example2 {
    public static void main(String[] args) {
        String str = "Hello Java";

        System.out.println(str.length()); // length of string

        System.out.println(str.charAt(6)); // accessing charaters

        // extracting substring 
        System.out.println(str.substring(6));
        System.out.println(str.substring(0,5));

        //comparing strings equals() equalsIgnoreCase() compareTo()

        System.out.println("Hello".equals("hello")); // false
        System.out.println("Hello".equalsIgnoreCase("hello")); //true
        System.out.println("apple".compareTo("banana")); // -1

        //finding a character
        System.out.println(str.indexOf('J'));
        System.out.println(str.lastIndexOf('a'));

        //checking string startswith(), endswith()

        System.out.println(str.startsWith("Hello"));
        System.out.println(str.endsWith("Java"));

        //replacing character
        System.out.println(str.replace("Java", "World"));

        String text = "  Hello  ";

        System.out.println(text.trim());

        String words[] = str.split(" ");
        System.out.println(words[0]);

        //Changing case
        System.out.println(str.toUpperCase());
        System.out.println(str.toLowerCase());
    }
}
