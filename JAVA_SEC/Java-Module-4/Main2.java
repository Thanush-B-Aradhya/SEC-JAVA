class Shape {
    void displayShape() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Method to calculate area of circle
    void area() {
        double a = Math.PI * radius * radius;
        System.out.println("Circle Area: " + a);
    }
}

class Rectangle extends Shape {
    double length, breadth;

    Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area of rectangle
    void area() {
        double a = length * breadth;
        System.out.println("Rectangle Area: " + a);
    }
}

public class Main2 {
    public static void main(String[] args) {

        // Circle object
        Circle c = new Circle(7);
        c.displayShape();
        c.area();

        System.out.println();

        // Rectangle object
        Rectangle r = new Rectangle(10, 5);
        r.displayShape();
        r.area();
    }
}
