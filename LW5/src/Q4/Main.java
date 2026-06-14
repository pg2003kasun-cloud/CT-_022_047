package Q4;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        System.out.println("Enter pet info. STOP to finish.");
        while (true) {
            System.out.print("Name: ");
            String name = sc.nextLine().trim();
            if (name.equalsIgnoreCase("STOP")) break;

            System.out.print("Type (c/d): ");
            char type = sc.nextLine().trim().toLowerCase().charAt(0);

            if (type == 'd') {
                Dog dog = new Dog();
                dog.setName(name);
                System.out.print("Weight (kg): ");
                dog.setWeight(Double.parseDouble(sc.nextLine().trim()));
                pets.add(dog);
            } else {
                Cat cat = new Cat();
                cat.setName(name);
                System.out.print("Coat color: ");
                cat.setCoatColor(sc.nextLine().trim());
                pets.add(cat);
            }
        }

        System.out.println("\n--- Cats ---");
        for (Pet p : pets)
            if (p instanceof Cat c)
                System.out.println("Name: " + c.getName() + " | Coat: " + c.getCoatColor());

        System.out.println("\n--- Dogs ---");
        for (Pet p : pets)
            if (p instanceof Dog d)
                System.out.printf("Name: %s | Weight: %.1f kg%n", d.getName(), d.getWeight());

        sc.close();
    }
}