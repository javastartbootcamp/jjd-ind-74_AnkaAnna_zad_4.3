package pl.javastart.task;

public class Square {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calculateSquareArea() {
        return this.side * this.side;
    }
}
