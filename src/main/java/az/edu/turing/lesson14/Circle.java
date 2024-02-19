package az.edu.turing.lesson14;

public class Circle {   //UML diagrams
    public static long countOfCircles;
    private double radius;
    private String color;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
        countOfCircles++;
    }

    // getters and setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!"white".equals(color)) {
            this.color = color;
        }
    }

    //method
    public double calcLength() {
        return 2 * Math.PI * this.radius;
    }
}
