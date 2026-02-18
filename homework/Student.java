class Student {
    String name;
    int rollNumber;
    String course;

    // Constructor to initialize values
    Student(String name, int rollNumber, String course) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.course = course;
    }

    // Non-static method 
    void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Course: " + course);
    }

    // Static method 
    static void displayCollegeName() {
        System.out.println("College Name: LBEF College");
    }

    // Main method
    public static void main(String[] args) {
        Student s1 = new Student("Dikshhita Shrestha", 101, "BScIT Cloud Engineering");

        Student.displayCollegeName();   // Static method call
        s1.displayStudentDetails();     // Non-static method call
    }
}
