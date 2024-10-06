import java.util.*;
public class Q4 {

    String name;
    String location;
    String cuisineType;
    double averageCost;

    void serveDish(String dishName){
        System.out.println(dishName + " is Being Served: ");
    }

    void updateCost(double newCost){
        averageCost = newCost;
        System.out.println("The Updated New Average Cost Per Person is: " + averageCost);
    }

    void printResturantDetail() {
        System.out.println("  The Name of Resturant is: " + name);
        System.out.println("  The Location of The Resturant is: " + location);
        System.out.println("  The Type  of Cuisine Served: " + cuisineType);
        System.out.println("  The Average Cost of Per Person is: " + averageCost);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Q4 obj1 = new Q4();

        System.out.print("Enter The Name of The Resturant: ");
        obj1.name = input.nextLine();

        System.out.print("Enter The Location of The Resturant: ");
        obj1.location = input.nextLine();

        System.out.print("Enter The Type of Cuisine Served: ");
        obj1.cuisineType = input.nextLine();

        System.out.print("Enter The Average Cost Per Person: ");
        obj1.averageCost = input.nextDouble();


        obj1.printResturantDetail();

        input.nextLine();

        System.out.print("Enter the Dish Name: ");
        String a = input.nextLine();
        obj1.serveDish(a);


        System.out.print("Enter the updated cost of per person is: ");
        double b = input.nextDouble();
        obj1.updateCost(b);

        obj1.printResturantDetail();

    }
}


