import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class BookList {
        public static void main(String[] args) {
            List<Book> bookList = new ArrayList<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.print("Enter the title of the book (or hit enter to exit): ");
                String title = scanner.nextLine();

                if (title.isEmpty()) {
                    break;
                }

                System.out.print("Enter the number of pages: ");
                int numberOfPages = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character after reading int

                System.out.print("Enter the publication year: ");
                int publicationYear = scanner.nextInt();
                scanner.nextLine(); // Consume the newline character after reading int

                Book book = new Book(title, numberOfPages, publicationYear);
                bookList.add(book);
            }

            System.out.print("Enter what to print (everything/name): ");
            String printOption = scanner.nextLine();

            System.out.println("Book Details:");
            if (printOption.equals("everything")) {
                for (Book book : bookList) {
                    System.out.println(book);
                }
            } else if (printOption.equals("name")) {
                for (Book book : bookList) {
                    System.out.println(book.getTitle());
                }
            }

        }
}

