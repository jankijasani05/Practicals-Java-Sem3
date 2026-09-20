class User {
    int userId;
    String userName;
    long mobileNumber;

    public User(int id, String name, long mobile) {
        userId = id;
        userName = name;
        mobileNumber = mobile;
    }

    public void displayUserDetails() {
        System.out.println("User ID: " + userId);
        System.out.println("Name: " + userName);
        System.out.println("Mobile: " + mobileNumber);
    }
}

class Customer extends User {
    String customerAddress;
    int orderId;

    public Customer(int id, String name, long mobile, String address, int order) {
        super(id, name, mobile); 
        customerAddress = address;
        orderId = order;
    }

    public void displayCustomerDetails() {
        displayUserDetails();
        System.out.println("Address: " + customerAddress);
        System.out.println("Order ID: " + orderId);
    }
}

class PremiumCustomer extends Customer {
    String membershipType;
    double discountPercentage;

    public PremiumCustomer(int id, String name, long mobile, String address, int order, String membership, double discount) {
        super(id, name, mobile, address, order); 
        membershipType = membership;
        discountPercentage = discount;
    }

    public double calculateDiscount(double orderAmount) {
        return orderAmount * (discountPercentage / 100);
    }

    public void displayFinalBill(double orderAmount) {
        double discount = calculateDiscount(orderAmount);
        double finalAmount = orderAmount - discount;
        System.out.println("Order Amount: Rs. " + orderAmount);
        System.out.println("Discount Applied (" + discountPercentage + "%): -Rs. " + discount);
        System.out.println("Final Bill Amount: Rs. " + finalAmount);
    }

    public void displayPremiumDetails() {
        System.out.println("--- Premium Customer Details ---");
        displayCustomerDetails(); // Inherited from Customer
        System.out.println("Membership: " + membershipType);
        System.out.println("Eligible Discount: " + discountPercentage + "%");
    }
}

public class OnlineShoppingDemo {
    public static void main(String[] args) {
        PremiumCustomer pc = new PremiumCustomer(1, "Bob", 9876543210L, "Mumbai", 5543, "Gold", 15.0);
        
        pc.displayPremiumDetails();
        System.out.println();
        pc.displayFinalBill(2000.0); // Simulating a purchase of 2000
    }
}