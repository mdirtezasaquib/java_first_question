import java.util.*;
public class Q8 {

    String flightNumber;
    String destination;
    int duration;
    double ticketPrice;

    void boardFlight(){
        System.out.println(" THE FLIGHT IS BOARDING ");
    }

    void updateTicketPrice(double newPrice){
        ticketPrice = newPrice;
        System.out.println("The New Price Of The Ticket is: =  " + newPrice);
    }

    void printFlightDetail() {
        System.out.println("  The Flight Number is: = " + flightNumber);
        System.out.println("  The Destination Of Flight is: = " + destination);
        System.out.println("  The Flight Duration In Hours is: = " + duration);
        System.out.println("  The Price Of Flight Ticket is: = " + ticketPrice);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Q8 obj1 = new Q8();

        System.out.print("Enter The Flight Number: ");
        obj1.flightNumber = input.nextLine();

        System.out.print("Enter The Destination of Flight: ");
        obj1.destination = input.nextLine();

        System.out.print("Enter The Flight Duration In Hours: ");
        obj1.duration = input.nextInt();

        System.out.print("Enter The Price Of Flight Ticket: ");
        obj1.ticketPrice = input.nextDouble();


        obj1.printFlightDetail();

        input.nextLine();

        obj1.boardFlight();


        System.out.print("Enter the New Price Of Ticket is: ");
        double b = input.nextDouble();
        obj1.updateTicketPrice(b);

        obj1.printFlightDetail();

    }
}




