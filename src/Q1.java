import java.util.*;
public class Q1 {

    String name;
    int rolNumber;
    String grade;
    double marks;


    void study(int hours){
        System.out.println(name + " Studied " + hours + " hours ");
    }
    void takeExam(double score){
        marks = score;
        System.out.println(name + " obtained marks " + score);
    }

    void printStudentDetail(){
        System.out.println("Student Name = " + name);
        System.out.println("Student Roll Number = " + rolNumber);
        System.out.println("Student Grade = " + grade);
        System.out.println("Student Marks = " + marks);

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        Q1 obj = new Q1();

        System.out.print("Enter The Student Name: ");
        obj.name = input.nextLine();

        System.out.print("Enter The Student Roll Number: ");
        obj.rolNumber = input.nextInt();

        input.nextLine();

        System.out.print("Enter The Student Grade: ");
        obj.grade = input.nextLine();

        System.out.print("Enter The Student Marks: ");
        obj.marks = input.nextDouble();

        obj.printStudentDetail();

        System.out.print("Enter the hours: ");
        int a = input.nextInt();
        obj.study(a);

        System.out.print("Enter the score: ");
        double b = input.nextDouble();
        obj.takeExam(b);

        obj.printStudentDetail();

    }
}
