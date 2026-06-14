package Q6;
public class Cat extends Pet {
    private String coatColor;
    public String getCoatColor() { return coatColor; }
    public void setCoatColor(String c) { coatColor = c; }
    @Override public String speak() { return "Meow!"; }
}
