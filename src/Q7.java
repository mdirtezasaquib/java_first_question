import java.util.*;
public class Q7 {

    String name;
    String location;
    int booksAvailable;
    double membershipFee;

    void borrowBook(){
        booksAvailable -= 1;
        System.out.println(" You Have Successfully Borrowed One Book");
    }

    void returnBook(){
        booksAvailable += 1;
        System.out.println(" You Have Successfully Returned One Book");
    }

    void printLibraryDetail() {
        System.out.println("  The Name Of Library is: = " + name);
        System.out.println("  The Location Of Library is: = " + location);
        System.out.println("  The Number Of Books Available For Borrowing is: = " + booksAvailable);
        System.out.println("  The Member Ship Fee For Joining The Library is: = " + membershipFee);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Q7 obj1 = new Q7();

        System.out.print("Enter The Name Of Library is: ");
        obj1.name = input.nextLine();

        System.out.print("Enter The Location Of Library is: ");
        obj1.location = input.nextLine();

        System.out.print("Enter The Number Of Books Available For Borrowing is: ");
        obj1.booksAvailable = input.nextInt();

        System.out.print("Enter The Member Ship Fee: ");
        obj1.membershipFee = input.nextDouble();


        obj1.printLibraryDetail();


        obj1.borrowBook();


        obj1.returnBook();

        obj1.printLibraryDetail();

    }
}




