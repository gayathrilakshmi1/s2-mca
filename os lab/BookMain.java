import java.util.Scanner;

class Publisher {
    String publisherName;

    void getPublisher() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Publisher Name: ");
        publisherName = sc.nextLine();
    }
}

class Book extends Publisher {
    String title;
    String author;

    void getBook() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Book Title: ");
        title = sc.nextLine();

        System.out.print("Enter Author Name: ");
        author = sc.nextLine();

        getPublisher();
    }

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Publisher: " + publisherName);
    }
}

class Literature extends Book {
    void displayLiterature() {
        System.out.println("\nLiterature Book Details:");
        display();
    }
}

class Fiction extends Book {
    void displayFiction() {
        System.out.println("\nFiction Book Details:");
        display();
    }
}

public class BookMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Literature l = new Literature();
        Fiction f = new Fiction();

        System.out.println("Enter Literature Book Details");
        l.getBook();

        System.out.println("\nEnter Fiction Book Details");
        f.getBook();

        l.displayLiterature();
        f.displayFiction();
    }
}