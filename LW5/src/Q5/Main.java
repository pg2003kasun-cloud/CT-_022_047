package Q5;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        System.out.println("Enter pet info. Type STOP to finish.");
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

        // Build dog-only array
        ArrayList<Dog> dogs = new ArrayList<>();
        for (Pet p : pets) {
            if (p instanceof Dog) {
                dogs.add((Dog) p);
            }
        }

        if (dogs.isEmpty()) {
            System.out.println("No dogs entered.");
            sc.close();
            return;
        }

        double sum = 0, min = dogs.get(0).getWeight(), max = dogs.get(0).getWeight();
        for (Dog d : dogs) {
            double w = d.getWeight();
            sum += w;
            if (w < min) min = w;
            if (w > max) max = w;
        }

        System.out.printf("%nDog Stats (%d dogs):%n", dogs.size());
        System.out.printf("  Average : %.2f kg%n", sum / dogs.size());
        System.out.printf("  Minimum : %.2f kg%n", min);
        System.out.printf("  Maximum : %.2f kg%n", max);
        sc.close();
    }
}
