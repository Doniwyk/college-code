package Persegi;

public class Rectangle {
    public int side;

    public Rectangle(int side) {
        this.side = side;
    }
    public void showData() {
        System.out.println("Rectangle side length: " + side);
    }
    public int square() {
        return side * side;
    }

    public int perimeterArea() {
        return 4 * side;
    }

    public void squareArea() {
        System.out.println("Square Area\t\t\t: " + side * side);
    }

    public void perimeter() {
        System.out.println("Square Perimeter\t: " + side * 4);
    }

    public void showAnswer() {
        System.out.println("Square Area\t\t\t: " + square());
        System.out.println("Square Perimeter\t: " + perimeterArea());
    }
}
