package studentinfo;
import java.util.Scanner;

public class Student {
    int studentId;
    String studentName;
    String course;
    int marks;

    // Method to accept input from the user
    public void acceptDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student ID: ");
        studentId = sc.nextInt();
        sc.nextLine(); // Move to the next line
        System.out.print("Enter Student Name: ");
        studentName = sc.nextLine();
        System.out.print("Enter Course: ");
        course = sc.nextLine();
        System.out.print("Enter Marks (0-100): ");
        marks = sc.nextInt();
    }

    // Method to return the grade based on marks
    public String calculateGrade() {
        if (marks >= 90 && marks <= 100) {
            return "A+";
        } else if (marks >= 80 && marks <= 89) {
            return "A";
        } else if (marks >= 70 && marks <= 79) {
            return "B";
        } else if (marks >= 60 && marks <= 69) {
            return "C";
        } else {
            return "D";
        }
    }

    // Method to display everything
    public void displayDetails() {
        System.out.println("\n--- Student Details ---");
        System.out.println("ID: " + studentId);
        System.out.println("Name: " + studentName);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}