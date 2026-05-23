package Q4;
import Q4.Owner;

public class Main {
    public static void main(String[] args) {
        Owner owner = new Owner("Alice", "555-1234");
        Bicycle bike = new Bicycle(owner);

        System.out.println("Owner: " + bike.getOwner().getOwnerName());
        System.out.println("Phone: " + bike.getOwner().getPhoneNo());
    }
}