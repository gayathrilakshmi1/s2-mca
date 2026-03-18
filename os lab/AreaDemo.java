import java.util.Scanner;
class Area {
    double calculate(double radius) {  
        return 3.14 * radius * radius;
    }
    double calculate(double length, double breadth) { 
        return length * breadth;
    }
    double calculate(int base, int height) { 
        return 0.5 * base * height;
    }
}
public class AreaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Area a = new Area();
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        System.out.println("Area of Circle: " + a.calculate(r));
        System.out.print("Enter length and breadth of rectangle: ");
        double l = sc.nextDouble();
        double b = sc.nextDouble();
        System.out.println("Area of Rectangle: " + a.calculate(l, b));
        System.out.print("Enter base and height of triangle: ");
        int base = sc.nextInt();
        int height = sc.nextInt();
        System.out.println("Area of Triangle: " + a.calculate(base, height));
    }
}