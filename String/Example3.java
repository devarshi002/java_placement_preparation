package String;

public class Example3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append(" Java");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
    }
}
