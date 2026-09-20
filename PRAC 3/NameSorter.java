import java.util.Arrays;
import java.util.Scanner;

public class NameSorter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many names do you want to enter? ");
        int count = sc.nextInt();
        sc.nextLine(); // consume newline
        
        String[] names = new String[count];
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }
        
        Arrays.sort(names); // Sorts alphabetically
        
        System.out.println("\nSorted Names:");
        for (String name : names) {
            System.out.println(name);
        }
        sc.close();
    }
}