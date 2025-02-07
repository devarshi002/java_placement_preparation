package encapsulation;

public class Student {
    //private variables
    private String name;
    private int age;

    //getter for name
    public String getName() {
        return name;
    }

    // setter for name
    public void setName(String name) {
        this.name = name;
    }

    //getter for age
    public int getAge() {
        return age;
    }

    // setter for age with validation

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }else {
            System.out.println("Age cannot be negative or zero.");
        }
    }

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.setName("Deva");
        s1.setAge(22);

        System.out.println("Name: "+ s1.getName());
        System.out.println("age: "+ s1.getAge());
    }
}
