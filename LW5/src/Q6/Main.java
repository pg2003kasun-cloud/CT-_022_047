package Q6;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    // Three parallel lists — always kept in sync
    static ArrayList<Pet> pets = new ArrayList<>();
    static ArrayList<Cat> cats = new ArrayList<>();
    static ArrayList<Dog> dogs = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // Initial input
        System.out.println("Initial setup — enter pets. STOP to finish.");
        while (true) {
            System.out.print("Name: ");
            String name = sc.nextLine().trim();
            if (name.equalsIgnoreCase("STOP")) break;
            System.out.print("Type (c/d): ");
            char type = sc.nextLine().trim().toLowerCase().charAt(0);
            if (type == 'd') addDog(name); else addCat(name);
        }

        // Menu loop — 0 to quit
        int choice;
        do {
            printMenu();
            choice = Integer.parseInt(sc.nextLine().trim());
            switch (choice) {
                case 1 :
                {
                    System.out.print("Cat name: ");
                    addCat(sc.nextLine().trim());
                    break;
                }
                case 2:
                    {
                        System.out.print("Dog name: ");
                        addDog(sc.nextLine().trim());
                        break;;
                    }
                case 3 :
                {
                    System.out.print("Cat name to remove: ");
                    removeCat(sc.nextLine().trim());
                    break;
                }
                case 4 :
                {
                    System.out.print("Dog name to remove: ");
                    removeDog(sc.nextLine().trim());
                    break;
                }
                case 0 :
                {
                    System.out.println("Goodbye!");
                    break;
                }
                default :
                    System.out.println("Invalid choice.");
                    break;
            }
        } while (choice != 0);
        sc.close();
    }

    static void printMenu() {
        System.out.println("\n=== Pet Menu ===");
        System.out.println("1. Add Cat\n2. Add Dog\n3. Remove Cat\n4. Remove Dog\n0. Quit");
        System.out.print("Choice: ");
    }

    static void addCat(String name) {
        Cat cat = new Cat();
        cat.setName(name);
        System.out.print("Coat color: ");
        cat.setCoatColor(sc.nextLine().trim());
        cats.add(cat);
        pets.add(cat);           // add to both lists
        System.out.println("Added cat: " + name);
        printSummary();
    }

    static void addDog(String name) {
        Dog dog = new Dog();
        dog.setName(name);
        System.out.print("Weight (kg): ");
        dog.setWeight(Double.parseDouble(sc.nextLine().trim()));
        dogs.add(dog);
        pets.add(dog);           // add to both lists
        System.out.println("Added dog: " + name);
        printSummary();
    }

    static void removeCat(String name) {
        Cat found = null;
        for (Cat c : cats)
            if (c.getName().equalsIgnoreCase(name)) { found = c; break; }
        if (found != null) {
            cats.remove(found);
            pets.remove(found);  // remove from both lists
            System.out.println("Removed cat: " + name);
        } else {
            System.out.println("Cat not found: " + name);
        }
        printSummary();
    }

    static void removeDog(String name) {
        Dog found = null;
        for (Dog d : dogs)
            if (d.getName().equalsIgnoreCase(name)) { found = d; break; }
        if (found != null) {
            dogs.remove(found);
            pets.remove(found);  // remove from both lists
            System.out.println("Removed dog: " + name);
        } else {
            System.out.println("Dog not found: " + name);
        }
        printSummary();
    }

    static void printSummary() {
        System.out.println("\n-- Current Cats --");
        for (Cat c : cats)
            System.out.println("  " + c.getName() + " | Coat: " + c.getCoatColor());
        System.out.println("-- Current Dogs --");
        for (Dog d : dogs)
            System.out.printf("  %s | Weight: %.1f kg%n", d.getName(), d.getWeight());
    }
}