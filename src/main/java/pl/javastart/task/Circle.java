package pl.javastart.task;

public class Circle {
    private double r;

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double calculateCircleArea(Circle circle) {
        return 3.14 * circle.getR() * circle.getR();
    }
}
