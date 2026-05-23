import Q1.Temperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double c = scanner.nextDouble();

        Temperature temp = new Temperature(c);
        System.out.println(c + "°C = " + temp.toFahrenheit() + "°F");
    }
}