class Course {
    String courseName;
    String duration;
    double fee;

    // Constructor for initialization
    Course(String courseName, String duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Non-static method 
    void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration);
        System.out.println("Fee: " + fee);
    }

    // Static method 
    static void displayPlatformName() {
        System.out.println("Platform: LearnHub Online Courses");
    }

    public static void main(String[] args) {
        Course c = new Course("Java Programming", "6 Months", 30000);

        displayPlatformName();
        c.displayCourseDetails();
    }
}
