import java.util.*;
public class Q3 {

    String title;
    String genre;
    int duration;
    double rating;

    void watchMovie(){
        System.out.println(" WELCOME TO START THE MOVIE : ");
    }

    void rateMovie(double newRating){
        rating = newRating;
        System.out.println("The Updated Rating is " + newRating);
    }

    void printMovieDetail() {
        System.out.println("  The Title of Movie is " + title);
        System.out.println("  The Genre of Movie is " + genre);
        System.out.println("  The Duration  of Movie is " + duration);
        System.out.println("  The Rating of Movie is " + rating);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Q3 obj1 = new Q3();

        System.out.print("Enter the Title of The Movie: ");
        obj1.title = input.nextLine();

        System.out.print("Enter the Movie Genre: ");
        obj1.genre = input.nextLine();

        System.out.print("Enter the Duration of Movie in Minute: ");
        obj1.duration = input.nextInt();

        System.out.print("Enter the Movie Rating Out Of 10: ");
        obj1.rating = input.nextDouble();


        obj1.printMovieDetail();

        obj1.watchMovie();

        System.out.print("Enter the updated Rating of Movie out of 10: ");
        double a = input.nextDouble();
        obj1.rateMovie(a);

        obj1.printMovieDetail();

    }
}

