import java.util.Scanner;

// 1. Create the Interface
interface Employee {
    void calculateSalary();
    void displayDetails();
}

// 2. Create the Manager class implementing Employee
class OfficeManager implements Employee {
    String name;
    double salary;

    public void acceptDetails(Scanner sc) {
        System.out.print("Enter Manager Name: ");
        name = sc.nextLine();
        System.out.print("Enter Manager Salary: ");
        salary = sc.nextDouble();
        sc.nextLine(); // Consume newline
    }

    public void calculateSalary() {
        // Adding a fixed bonus for managers
        salary = salary + 5000; 
    }

    public void displayDetails() {
        System.out.println("Manager Name: " + name + " | Final Salary: Rs. " + salary);
    }
}

// 3. Create the Developer class implementing Employee
class Developer implements Employee {
    String name;
    double salary;

    public void acceptDetails(Scanner sc) {
        System.out.print("Enter Developer Name: ");
        name = sc.nextLine();
        System.out.print("Enter Developer Salary: ");
        salary = sc.nextDouble();
        sc.nextLine(); // Consume newline
    }

    public void calculateSalary() {
        // Adding a fixed bonus for developers
        salary = salary + 2000; 
    }

    public void displayDetails() {
        System.out.println("Developer Name: " + name + " | Final Salary: Rs. " + salary);
    }
}

// Main execution class
public class EmployeeRoles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        OfficeManager mgr = new OfficeManager();
        System.out.println("--- Manager Setup ---");
        mgr.acceptDetails(sc);
        mgr.calculateSalary();
        
        Developer dev = new Developer();
        System.out.println("--- Developer Setup ---");
        dev.acceptDetails(sc);
        dev.calculateSalary();
        
        System.out.println("\n--- Final Employee Records ---");
        mgr.displayDetails();
        dev.displayDetails();
        
        sc.close();
    }
}