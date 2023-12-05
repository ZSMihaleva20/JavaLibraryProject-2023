import java.util.Scanner;

public class Main {
    public static void main(String[] main) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        String author = scanner.nextLine();
        int year = scanner.nextInt();

        Book bookOne = new Book(title, author, year);
        BookProcessor bookTwo = new BookProcessor(bookOne);
        bookTwo.start();
        bookTwo.interrupt();
    }
}
