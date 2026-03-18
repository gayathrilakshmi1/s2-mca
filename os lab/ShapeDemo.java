import java.util.Scanner;

interface Shape {
    void area();
    void perimeter();
}

class Circle implements Shape {
    double r;

    Circle(double r) {
        this.r = r;
    }

    public void area() {
        System.out.println("Area = " + (3.14 * r * r));
    }

    public void perimeter() {
        System.out.println("Perimeter = " + (2 * 3.14 * r));
    }
}

class Rectangle implements Shape {
    double l, b;

    Rectangle(double l, double b) {
        this.l = l;
        this.b = b;
    }

    public void area() {
        System.out.println("Area = " + (l * b));
    }

    public void perimeter() {
        System.out.println("Perimeter = " + (2 * (l + b)));
    }
}

public class ShapeDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.print("Enter choice: ");
        int ch = sc.nextInt();

        if (ch == 1) {

            System.out.print("Enter Radius: ");
            double r = sc.nextDouble();

            Circle c = new Circle(r);
            c.area();
            c.perimeter();
        }

        else if (ch == 2) {

            System.out.print("Enter Length: ");
            double l = sc.nextDouble();

            System.out.print("Enter Breadth: ");
            double b = sc.nextDouble();

            Rectangle rec = new Rectangle(l, b);
            rec.area();
            rec.perimeter();
        }

        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}