import java.util.*;
public class Q2 {

    String brand;
    String model;
    int ramSize;
    int storageSize;

    void start(){
        System.out.println(" WELCOME TO START THE LAPTOP : ");
    }

    void upgradeRam(int addRam){
        ramSize = addRam;
        System.out.println("The Updated Size of Ram is " + ramSize);
    }

    void printDetail() {
        System.out.println("  The brand of Laptop is " + brand);
        System.out.println("  The model of Laptop is " + model);
        System.out.println("  The Ram size of Laptop is " + ramSize);
        System.out.println("  The storage size  of Laptop is " + storageSize);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Q2 obj1 = new Q2();

        System.out.print("Enter the Laptop Brand: ");
        obj1.brand = input.nextLine();

        System.out.print("Enter the Model of laptop is ");
        obj1.model = input.nextLine();

        System.out.print("Enter the Ram Size of laptop is ");
        obj1.ramSize = input.nextInt();

        System.out.print("Enter the Storage Size of laptop is ");
        obj1.storageSize = input.nextInt();


        obj1.printDetail();

        obj1.start();

        System.out.print("Enter the updated ram size: ");
        int a = input.nextInt();
        obj1.upgradeRam(a);

        obj1.printDetail();

    }
}
