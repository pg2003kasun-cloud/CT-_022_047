package Q2;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pet> pets = new ArrayList<>();

        System.out.println("Enter name and type (c/d). Name STOP to finish.");
        while (true) {
            System.out.print("Name: ");
            String name = sc.nextLine().trim();//trim() removes the spaces from both ends of that text
            if(name.equals("STOP"))
                break;


            System.out.print("Type (c/d): ");
            char type = sc.nextLine().trim().toLowerCase().charAt(0);

            Pet pet = (type == 'd') ? new Dog() : new Cat();
            pet.setName(name);
            pets.add(pet);
        }

        System.out.println("\n Pet List \n");
        for (Pet c : pets) {
            String type = (c instanceof Dog) ? "Dog" : "Cat";
            System.out.println("Name: " + c.getName() + " | Type: " + type);
        }
        sc.close();
    }
}