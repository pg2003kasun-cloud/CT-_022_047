package Q3;

public class circle {
    private double radius;

    public circle() {
        this.radius = 0.0;
    }

    public circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public  double computeArea(){
        return  Math.PI *  radius * radius;
    }
    public double computerCircumference(){
        return  2 * Math.PI *radius;
     }
}