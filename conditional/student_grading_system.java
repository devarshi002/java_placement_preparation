package conditional;

import java.util.*;

public class student_grading_system {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int Marks = sc.nextInt();

            if(Marks >= 90) {
                System.out.println("your grade is : A+");
            } else if(Marks >= 75 && Marks < 90){
                System.out.println("your grade is : A");
            }
            else if(Marks >= 50 && Marks < 75){
                System.out.println("your grade is : B");
            }
            else if(Marks < 50){
                System.out.println("you are fail");
            }
            else{
                System.out.println("Please enter proper marks");
            }
        }
    }
}
