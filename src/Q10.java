import java.util.*;
public class Q10 {

    String loanType;
    double loanAmount;
    double interestRate;
    int tenure;

    void applyForLoan(double amount){
        loanAmount = amount;
        System.out.println(amount + " Applied Amount");
    }

    void updateInterest(double newRate){
        interestRate = newRate;
        System.out.println("The New Interest Rate is: = " + newRate);
    }

    void printLoanDetail() {
        System.out.println("  The Type Of Loan is: = " + loanType);
        System.out.println("  The Amount Of The Loan is: = " + loanAmount);
        System.out.println("  The Interest Rate Of The Loan is: = " + interestRate);
        System.out.println("  The Loan Tenure In Years is: = " + tenure);
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Q10 obj1 = new Q10();

        System.out.print("Enter The Type Of Loan is: ");
        obj1.loanType = input.nextLine();

        System.out.print("Enter The Amount Of Loan is: ");
        obj1.loanAmount = input.nextDouble();

        System.out.print("Enter The Interest Rate Of Loan is: ");
        obj1.interestRate = input.nextDouble();

        System.out.print("Enter The Loan Tenure In Years is: ");
        obj1.tenure = input.nextInt();


        obj1.printLoanDetail();


        System.out.print("Enter the New Loan Amount is: ");
        double a = input.nextDouble();
        obj1.applyForLoan(a);


        System.out.print("Enter the New Interest Rate is: ");
        double b = input.nextDouble();
        obj1.updateInterest(b);

        obj1.printLoanDetail();

    }
}





