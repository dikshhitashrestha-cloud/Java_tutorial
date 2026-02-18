class Student {

    String name;
    int age;
    String course;

    // 1. Default Constructor
    Student() {
        name = "Not Assigned";
        age = 0;
        course = "Not Assigned";
    }

    // 2. Constructor with two parameters
    Student(String n, int a) {
        name = n;
        age = a;
        course = "Not Assigned";
    }

    // 3. Constructor with three parameters
    Student(String n, int a, String c) {
        name = n;
        age = a;
        course = c;
    }

    // Method to display details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("--------------------");
    }
}

public class ConstructorOverloadingDemo {
    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Dikshhita", 20);
        Student s3 = new Student("Dikshhita", 20, "BScIT");

        s1.display();
        s2.display();
        s3.display();
    }
}
