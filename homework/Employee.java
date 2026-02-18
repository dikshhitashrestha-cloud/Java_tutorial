class Employee {
    int employeeId;
    String name;
    double salary;

    // Constructor to assign values
    Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    // Non-static method 
    void calculateAnnualSalary() {
        double annualSalary = salary * 12;
        System.out.println("Annual Salary: " + annualSalary);
    }

    // Static method 
    static void displayCompanyInfo() {
        System.out.println("Company Name:Tripura Mega Enterprises");
        System.out.println("Location: Nepal");
    }

    // Main method
    public static void main(String[] args) {
        Employee e1 = new Employee(201, "Dipson Shrestha", 45000);

        Employee.displayCompanyInfo();   // Static method
        e1.calculateAnnualSalary();      // Non-static method
    }
}
