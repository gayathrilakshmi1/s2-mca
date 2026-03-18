import java.util.Scanner;

class Employee {
    int empid;
    String name;
    double salary;
    String address;
}

class Teacher extends Employee {
    String department;
    String subject;

    void display() {
        System.out.println(empid + " " + name + " " + salary + " " + address + " " + department + " " + subject);
    }
}

public class TeacherDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of teachers: ");
        int n = sc.nextInt();
        sc.nextLine();

        Teacher t[] = new Teacher[n];

        for(int i=0;i<n;i++) {
            t[i] = new Teacher();

            System.out.print("EmpID: ");
            t[i].empid = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            t[i].name = sc.nextLine();

            System.out.print("Salary: ");
            t[i].salary = sc.nextDouble();
            sc.nextLine();

            System.out.print("Address: ");
            t[i].address = sc.nextLine();

            System.out.print("Department: ");
            t[i].department = sc.nextLine();

            System.out.print("Subject: ");
            t[i].subject = sc.nextLine();
        }

        for(int i=0;i<n;i++)
            t[i].display();
    }
}