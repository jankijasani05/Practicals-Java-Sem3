import java.util.Scanner;

public class StringBuilderTasks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // a) Username Generator
        System.out.println("--- a) Username Generator ---");
        System.out.print("Enter First Name: ");
        String first = sc.nextLine();
        System.out.print("Enter Last Name: ");
        String last = sc.nextLine();
        StringBuilder username = new StringBuilder();
        username.append(first.toLowerCase()).append(".").append(last.toLowerCase());
        System.out.println("Generated Username: " + username.toString());
        
        // b) Check whether a password is strong
        System.out.println("\n--- b) Password Strength Checker ---");
        System.out.print("Enter Password: ");
        String pass = sc.nextLine();
        StringBuilder passStatus = new StringBuilder(pass);
        if (passStatus.length() >= 8 && (passStatus.indexOf("@") != -1 || passStatus.indexOf("#") != -1)) {
            System.out.println("Strong Password");
        } else {
            System.out.println("Weak Password (Must be 8+ chars and contain @ or #)");
        }
        
        // c) SMS Character Counter
        System.out.println("\n--- c) SMS Character Counter ---");
        System.out.print("Type your SMS: ");
        String sms = sc.nextLine();
        StringBuilder smsBuilder = new StringBuilder(sms);
        int maxChars = 160;
        int used = smsBuilder.length();
        int left = maxChars - used;
        System.out.println("Characters Used : " + used + "   Characters Left : " + left);
        
        // d) Shopping Bill Generator
        System.out.println("\n--- d) Shopping Bill Generator ---");
        StringBuilder bill = new StringBuilder();
        bill.append("******** SHOP BILL ********\n");
        bill.append("Milk     : \u20B950\n");
        bill.append("Bread    : \u20B940\n");
        bill.append("Butter   : \u20B980\n");
        bill.append("---------------------------\n");
        bill.append("Total    : \u20B9170");
        System.out.println(bill.toString());
        
        sc.close();
    }
}