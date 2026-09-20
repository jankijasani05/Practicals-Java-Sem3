class StudentStatic {
    int rollNumber;
    String studentName;
    static String collegeName = "Mithibai College"; 
    static int count = 0; 

    public StudentStatic(int roll, String name) {
        rollNumber = roll;
        studentName = name;
        count++; // Increment static variable every time an object is created
    }

    public void display() {
        System.out.println("Roll No: " + rollNumber + " | Name: " + studentName + " | College: " + collegeName);
    }

    // Static method
    public static void totalStudents() {
        System.out.println("Total students created: " + count);
    }
}

public class StaticKeywordDemo {
    public static void main(String[] args) {
        StudentStatic s1 = new StudentStatic(101, "Rahul");
        StudentStatic s2 = new StudentStatic(102, "Sneha");
        StudentStatic s3 = new StudentStatic(103, "Amit");

        System.out.println("--- Student Roster ---");
        s1.display();
        s2.display();
        s3.display();

        System.out.println("\n--- System Summary ---");
        // Calling static method using the class name directly
        StudentStatic.totalStudents(); 
    }
}