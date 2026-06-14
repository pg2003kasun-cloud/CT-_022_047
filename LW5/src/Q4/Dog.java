package Q4;
public class Dog extends Pet {
    private double weight;

    public double getWeight() { return weight; }
    public void setWeight(double w) { weight = w; }

    @Override
    public String speak() { return "Woof!"; }
}