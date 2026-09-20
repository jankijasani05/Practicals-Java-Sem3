// Import the Student class from the studentinfo package
import studentinfo.Student;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println("--- Mithibai Student Record ---");
        
        // Create an object of Student
        Student s1 = new Student();
        
        // Call the methods
        s1.acceptDetails();
        s1.displayDetails();
    }
}