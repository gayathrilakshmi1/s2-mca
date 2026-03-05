import java.util.Scanner;

class Student {
    int rollno;
    int academicScore;

    void getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Roll Number: ");
        rollno = sc.nextInt();

        System.out.print("Enter Academic Score: ");
        academicScore = sc.nextInt();
    }
}

class Sports {
    int sportsScore;

    void getSports() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sports Score: ");
        sportsScore = sc.nextInt();
    }
}

class Result extends Student {
    Sports s = new Sports();

    void display() {
        System.out.println("\nStudent Result");
        System.out.println("Roll Number: " + rollno);
        System.out.println("Academic Score: " + academicScore);
        System.out.println("Sports Score: " + s.sportsScore);
        System.out.println("Total Score: " + (academicScore + s.sportsScore));
    }
}

public class Resultmain {
    public static void main(String[] args) {

        Result r = new Result();

        r.getStudent();
        r.s.getSports();
        r.display();
    }
}