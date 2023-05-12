import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class TvShowList {
    public static void main(String[] args) {
        List<TvShow> tvShowList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the TV show name (or hit enter to exit): ");
            String showName = scanner.nextLine();

            if (showName.isEmpty()) {
                break;
            }

            System.out.print("Enter the number of episodes: ");
            int numberOfEpisodes = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character after reading int

            System.out.print("Enter the genre: ");
            String genre = scanner.nextLine();

            TvShow tvShow = new TvShow(showName, numberOfEpisodes, genre);
            tvShowList.add(tvShow);
        }

        System.out.println("TV Show List:");
        for (TvShow tvShow : tvShowList) {
            System.out.println(tvShow);
        }
    }
}
