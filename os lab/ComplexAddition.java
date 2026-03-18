import java.util.Scanner;

public class ComplexAddition {
    public static void main(String[] args) {
        int a,b,c,d;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter real and imaginary part of first complex number: ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Enter real and imaginary part of second complex number: ");
        c=sc.nextInt();
        d=sc.nextInt();
        int real = a+b;
        int imag = b+d;
        System.out.println("Sum= " + real + "+i" + imag);

    }
}
