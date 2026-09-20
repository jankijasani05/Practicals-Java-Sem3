import java.util.Scanner;

class Student {
    int studentId;
    String studentName;
    String course;
    double marksAAS, marksJAVA, marksPython;

    // Default Constructor
    public Student() {
        studentId = 0;
        studentName = "Unknown";
        course = "Not Assigned";
        marksAAS = 0.0;
        marksJAVA = 0.0;
        marksPython = 0.0;
    }

    // Parameterized Constructor
    public Student(int id, String name, String crs, double aas, double java, double python) {
        studentId = id;
        studentName = name;
        course = crs;
        marksAAS = aas;
        marksJAVA = java;
        marksPython = python;
    }

    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        studentId = sc.nextInt();
        sc.nextLine(); // consume newline
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();
        System.out.print("Enter Course: ");
        course = sc.nextLine();
        System.out.print("Enter Marks in AAS: ");
        marksAAS = sc.nextDouble();
        System.out.print("Enter Marks in JAVA: ");
        marksJAVA = sc.nextDouble();
        System.out.print("Enter Marks in Python: ");
        marksPython = sc.nextDouble();
    }

    public double calculateTotal() {
        return marksAAS + marksJAVA + marksPython;
    }

    public double calculatePercentage() {
        return (calculateTotal() / 300.0) * 100;
    }

    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Total Marks: " + calculateTotal() + "/300");
        System.out.println("Percentage: " + calculatePercentage() + "%");
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Object 1 using Default Constructor
        System.out.println("Creating default student...");
        Student s1 = new Student();
        s1.displayDetails();
        
        // Accepting dynamic details for s1
        System.out.println("\nPlease enter details to update the default student:");
        s1.acceptDetails();
        s1.displayDetails();

        // Object 2 using Parameterized Constructor
        System.out.println("\nCreating parameterized student directly...");
        Student s2 = new Student(101, "Janki Jasani", "Computer Science", 85.5, 90.0, 88.0);
        s2.displayDetails();
    }
}