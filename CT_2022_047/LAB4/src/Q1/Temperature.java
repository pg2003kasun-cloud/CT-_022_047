package Q1;

import java.util.concurrent.Callable;

public class Temperature {
    private double Celsius;
    // No-Arg Constructor
    public Temperature() {
        this.Celsius = 0.0;
    }
    // Parameterized Constructor

    public Temperature(double celsius) {
        celsius = celsius;
    }
    //getter :return temperature in Celsius

    public double toCelsius() {
        return Celsius;
    }
    //getter :return temperature in Fahrenheit
    public double  toFahrenheit(){
        return Celsius* 9 / 5 + 32;
    }
    //setter: accept Celsius


    public void setCelsius(double celsius) {
        Celsius = celsius;
    }
    public void setFahrenheit(double fahrenheit){

       Celsius = (fahrenheit - 32) * 5 / 9;
    }


}
