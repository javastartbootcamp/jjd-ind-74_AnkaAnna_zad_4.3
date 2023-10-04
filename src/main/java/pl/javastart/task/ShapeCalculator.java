package pl.javastart.task;

class ShapeCalculator {

    double calculateSquareArea(Square square) {
        return square.getSide() * square.getSide();
    }

    double calculateCircleArea(Circle circle) {
        return 3.14 * circle.getR() * circle.getR();
    }

    double calculateTrianglePerimeter(Triangle triangle) {
        return triangle.getSide1() + triangle.getSide2() + triangle.getSide3();
    }

    double calculateRectPerimeter(Rectangle rectangle) {
        return rectangle.getSide1() + rectangle.getSide2();
    }

}
