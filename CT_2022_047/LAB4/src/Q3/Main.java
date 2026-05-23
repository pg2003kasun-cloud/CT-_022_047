package Q3;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter inner radius (ri): ");
        double ri = scanner.nextDouble();

        System.out.print("Enter outer radius (ro): ");
        double ro = scanner.nextDouble();

        circle inner = new circle(ri);
        circle outer = new circle(ro);

        double shadeArea = outer.computeArea() - inner.computeArea();
        System.out.printf("Area of circular region = %.2f%n", shadeArea);
    }
}