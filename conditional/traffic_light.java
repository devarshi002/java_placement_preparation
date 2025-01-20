package conditional;

import java.util.*;

public class traffic_light {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        String lightColor = sc.nextLine().trim().toLowerCase();

        switch (lightColor) {
            case "red":
                System.out.println("Stop");
                break;
            
            case "yellow":
                System.out.println("get ready");
                break;
            
            case "green":
                System.out.println("go");
                break;
            default:
                System.out.println("Invalid color!");
        }
        sc.close();
    }

}
