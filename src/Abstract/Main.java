package Abstract;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        MyBook myBook = new MyBook();
        myBook.setTitle("Title of the book: " + title);
        System.out.println(myBook.getTitle());
    }
}
