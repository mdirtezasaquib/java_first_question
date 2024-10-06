import java.util.*;
public class Q9 {

    String name;
    String location;
    int roomsAvailable;
    double rating;

    void bookRoom(){
        roomsAvailable -= 1;
        System.out.println(" You Have Successfully Booked The Room By One:");
    }

    void cancelRoom(){
        roomsAvailable += 1;
        System.out.println(" You Have Successfully cancelled Booked Room By One:");
    }

    void printHotelDetail() {
        System.out.println("  The Name Of Hotel is: = " + name);
        System.out.println("  The Location Of Hotel is: = " + location);
        System.out.println("  The Number Of Room Available For Booking is: = " + roomsAvailable);
        System.out.println("  The Hotel Rating Out Of 5 : = " + rating);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Q9 obj1 = new Q9();

        System.out.print("Enter The Name Of Hotel is: ");
        obj1.name = input.nextLine();

        System.out.print("Enter The Location Of Hotel is: ");
        obj1.location = input.nextLine();

        System.out.print("Enter The Number Of Rooms Available For Booking is: ");
        obj1.roomsAvailable = input.nextInt();

        System.out.print("Enter The Hotel Rating Out Of 5: ");
        obj1.rating = input.nextDouble();


        obj1.printHotelDetail();


        obj1.bookRoom();


        obj1.cancelRoom();

        obj1.printHotelDetail();

    }
}





