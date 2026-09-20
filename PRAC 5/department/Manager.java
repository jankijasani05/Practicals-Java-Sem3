package department;

// Import the interface from the 'company' package
import company.EmployeeTask2;

// The Manager class implements the Employee interface
public class Manager implements EmployeeTask2 {
    
    // We must provide a body for the abstract method
    public void calculateSalary() {
        double baseSalary = 40000;
        double bonus = 10000;
        double totalSalary = baseSalary + bonus;
        System.out.println("Manager Total Salary: Rs. " + totalSalary);
    }

    public static void main(String[] args) {
        // Create an object and call the method
        Manager m = new Manager();
        m.calculateSalary();
    }
}