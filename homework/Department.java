class Department {
    String departmentName;
    int totalStudents;

    // Constructor to initialize details
    Department(String departmentName, int totalStudents) {
        this.departmentName = departmentName;
        this.totalStudents = totalStudents;
    }

    // Non-static method 
    void displayDepartmentInfo() {
        System.out.println("Department Name: " + departmentName);
        System.out.println("Total Students: " + totalStudents);
    }

    // Static method 
    static void displayCollegeName() {
        System.out.println("College Name: LBEF College");
    }

    public static void main(String[] args) {
        Department dept = new Department("BSc IT", 120);

        displayCollegeName();
        dept.displayDepartmentInfo();
    }
}
