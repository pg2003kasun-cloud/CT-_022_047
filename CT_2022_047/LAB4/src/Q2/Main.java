package  Q2;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = scanner.nextDouble();

        Temperature temp = new Temperature();
        temp.setFahrenheit(f);  // uses setFahrenheit from Q1
        System.out.println(f + "°F = " + temp.toCelsius() + "°C");
    }
}