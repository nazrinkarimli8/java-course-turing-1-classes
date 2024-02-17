package az.edu.turing.lab;
import java.util.Scanner;

public class MovieMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Movie[] movies = new Movie[3];

        boolean exit = false;

        while (!exit) {
            System.out.println("Menu:");
            System.out.println("1. Input movies");
            System.out.println("2. Display movies and ratings");
            System.out.println("3. Input more movies");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    inputMovies(scanner, movies);
                    break;
                case 2:
                    displayMovies(movies);
                    break;
                case 3:
                    inputMoreMovies(scanner, movies);
                    break;
                case 0:
                    exit = true;
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("PLEASE TRY AGAIN!");
            }
        }
    }

    public static void inputMovies(Scanner scanner, Movie[] movies) {
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter name of movie " + (i + 1) + ": ");
            String name = scanner.next();
            System.out.print("Enter rating of movie " + (i + 1) + ": ");
            double rating = scanner.nextDouble();
            movies[i] = new Movie(name, rating);
        }
        System.out.println("Movies added successfully.");
    }

    public static void displayMovies(Movie[] movies) {
        System.out.println("Movies and Ratings:");
        for (Movie movie : movies) {
            System.out.println("Name: " + movie.getName() + ", Rating: " + movie.getRating());
        }
    }

    public static Movie[] inputMoreMovies(Scanner scanner, Movie[] movies) {
        System.out.println("How many movie do you want additional?");
        int count = scanner.nextInt();
        Movie[] newMovies;
        if (movies.length == 0) {
            movies = new Movie[count];
            for (int i = 0; i < count; i++) {
                System.out.print("Enter name of movie " + (i + 1) + ": ");
                String name = scanner.next();
                System.out.print("Enter rating of movie " + (i + 1) + ": ");
                double rating = scanner.nextDouble();
                Movie movie = new Movie(name, rating);
                movies[i] = movie;
            }
            return movies;
        } else {
            newMovies = new Movie[movies.length + count];
            for (int i = 0; i < movies.length; i++) {
                newMovies[i] = movies[i];
            }
            for (int i = movies.length; i < newMovies.length; i++) {
                System.out.print("Enter name of movie " + (i + 1) + ": ");
                String name = scanner.next();
                System.out.print("Enter rating of movie " + (i + 1) + ": ");
                double rating = scanner.nextDouble();
                Movie movie = new Movie(name, rating);
                newMovies[i] = movie;
            }
        }
        return newMovies;
    }
}

