package Assignments1__3;

import java.util.Scanner;

public class Assignment1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Student Name: ");
        String StudentName = input.nextLine();

        System.out.println("Enter Marks For Subject1: ");
        int Subject1Marks = input.nextInt();
        input.nextLine();

        System.out.println("Enter Marks For Subject2: ");
        int Subject2Marks = input.nextInt();
        input.nextLine();

        System.out.println("Enter Marks For Subject3: ");
        int Subject3Marks = input.nextInt();
        input.nextLine();

        int TotalMarks = Subject1Marks + Subject2Marks + Subject3Marks;
        float AverageMarks = TotalMarks/3;

        char grade;

        if (AverageMarks<60){
          grade = 'F';

        } else if (AverageMarks>=60 && AverageMarks<70){
            grade = 'D';

        } else if (AverageMarks>=70 && AverageMarks<80){
            grade = 'C';

        } else if (AverageMarks>=80 && AverageMarks<90){
            grade = 'B';

        } else if (AverageMarks>=90 && AverageMarks<=100){
            grade = 'A';

        } else {
            grade = '0';

        }
        String message;

        switch (grade) {
            case 'A':
                message = "Excellent Work";
                break;
            case 'B':
                message = "Great Job";
                break;
            case 'C':
                message = "Good Effort";
                break;
            case 'D':
                message = "You passed, But Aim Higher";
                break;
            case 'F':
                message = "You Need To Improve";
                break;
            default:
                message = "Invalid Grade";
        }



        System.out.println("studentName: " +StudentName);
        System.out.println("TotalMarks: " +TotalMarks);
        System.out.println("AverageMarks: " +AverageMarks);
        System.out.println("Grade: " +grade);
        System.out.println(message);














    }
}
