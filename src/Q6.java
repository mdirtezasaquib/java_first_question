import java.util.*;
public class Q6 {

    String title;
    String artist;
    int totalSong;
    double price;

    void playSong(int songNumber){
        System.out.println(songNumber + " Number Song is Being Played: ");
    }

    void changePrice(double newPrice){
        price = newPrice;
        System.out.println("The New Price Of The Album is: =  " + newPrice);
    }

    void printAlbumDetail() {
        System.out.println("  The Title of The Album is: = " + title);
        System.out.println("  The Artist Of The Album  is: = " + artist);
        System.out.println("  The Total Number Of Song is: = " + totalSong);
        System.out.println("  The Price Of Album is: = " + price);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Q6 obj1 = new Q6();

        System.out.print("Enter The Title Of The Album: ");
        obj1.title = input.nextLine();

        System.out.print("Enter The Artist Of The Album: ");
        obj1.artist = input.nextLine();

        System.out.print("Enter The Total Number Of Song: ");
        obj1.totalSong = input.nextInt();

        System.out.print("Enter The Price Of Album: ");
        obj1.price = input.nextDouble();


        obj1.printAlbumDetail();

        input.nextLine();

        System.out.print("Enter the Song Number: ");
        int a = input.nextInt();
        obj1.playSong(a);


        System.out.print("Enter the New Price Of Album is: ");
        double b = input.nextDouble();
        obj1.changePrice(b);

        obj1.printAlbumDetail();

    }
}



