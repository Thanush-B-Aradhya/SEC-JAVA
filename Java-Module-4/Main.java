// Parent class
class Shape {
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

// Subclass: Circle
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    double area() {
        return Math.PI * radius * radius;
    }
}

// Subclass: Rectangle
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    double area() {
        return length * width;
    }
}

// Main class
public class Main {
    public static void main(String[] args) {

        // Circle object
        Circle c = new Circle(5.0);
        c.displayShape();
        System.out.println("Area of Circle = " + c.area());

        // Rectangle object
        Rectangle r = new Rectangle(4.0, 6.0);
        r.displayShape();
        System.out.println("Area of Rectangle = " + r.area());
    }
}
