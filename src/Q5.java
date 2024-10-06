import java.util.*;
public class Q5 {

    String name;
    String adresss;
    int booksInStock;
    double rating;

    void sellBook(int numberSold){
        booksInStock -= numberSold;
        System.out.println(numberSold + " Book Sold ");
    }

    void addBook(int numberAdd){
        booksInStock += numberAdd;
        System.out.println("Books added: " + numberAdd);
    }

    void printBookStoreDetail() {
        System.out.println("  The Name of Book Store is: " + name);
        System.out.println("  The Address of The Book Store is: " + adresss);
        System.out.println("  The Number Of Book In Stock Is: " + booksInStock);
        System.out.println("  The Rating Of of Book Store Is: " + rating);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Q5 obj1 = new Q5();

        System.out.print("Enter The Name of The Book Store: ");
        obj1.name = input.nextLine();

        System.out.print("Enter The Adress of The Book Store: ");
        obj1.adresss = input.nextLine();

        System.out.print("Enter The Numbers Of Books Available: ");
        obj1.booksInStock = input.nextInt();

        System.out.print("Enter The Rating Of Book Store Out Of 5: ");
        obj1.rating = input.nextDouble();


        obj1.printBookStoreDetail();

        input.nextLine();

        System.out.print("Enter the Number of Sold Book: ");
        int a = input.nextInt();
        obj1.sellBook(a);


        System.out.print("Enter the Number Of Add Book: ");
        int b = input.nextInt();
        obj1.addBook(b);

        obj1.printBookStoreDetail();

    }
}



