class Employee1 {
    int employeeId;
    String name;
    double salary; // monthly salary

    // Constructor to assign values
    Employee1(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Non-static method 
    double calculateAnnualSalary() {
        return salary * 12;
    }

    // Static method 
    static void displayCompanyInfo() {
        System.out.println(

