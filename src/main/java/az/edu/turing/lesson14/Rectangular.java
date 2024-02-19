package az.edu.turing.lesson14;

public class Rectangular {
    public static long countOfRectangular;
    private String color;
    private double side1;
    private double side2;

    public Rectangular(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
        countOfRectangular++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!"white".equals(color)) {
            this.color = color;
        }
    }

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }


    public double calcLength() {
        return 2 * (this.side1 + this.side2);
    }

    public double calcArea() {
        return this.side1 * this.side2;
    }
}
