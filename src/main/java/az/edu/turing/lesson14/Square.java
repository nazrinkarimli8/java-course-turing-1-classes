package az.edu.turing.lesson14;

public class Square {
    public static long countOfSquares;
    private String color;
    private double side;

    public Square(double side) {
        this.side = side;
        countOfSquares++;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (!"white".equals(color)) {
            this.color = color;
        }
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calcLength() {
        return 4 * this.side;
    }

    public double calcArea() {
        return Math.pow(this.side, 2);
    }
}
