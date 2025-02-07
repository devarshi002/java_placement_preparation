package encapsulation;

public class AccessExample {
    public String publicVar = "Public Variable";
    private String privateVar = "Private Variable";
    protected String protectedVar = "Protected Variable";
    String defaultVar = "Default Variable";

    public static void main(String[] args) {
        AccessExample obj = new AccessExample();

        System.out.println(obj.publicVar);
        System.out.println(obj.privateVar);
        System.out.println(obj.protectedVar);
        System.out.println(obj.defaultVar);
    }
}
