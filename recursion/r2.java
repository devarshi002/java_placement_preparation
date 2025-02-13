package recursion;

public class r2 {
    public static void main(String[] args) {
        int n = 1;
        printNumb(n);
    }

    public static void printNumb(int n) {
        if (n == 6) {
            return;
        }
        System.out.println(n);
        printNumb(n+1);
    }
}
