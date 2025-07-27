package Assignments1__3;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Definition of constant values
        final String valid_email = "mohamed@intrast.com";
        final String valid_password = "mohamed123";

        //3 attempts login
        int attempts = 3;
        boolean isLoggedIn = false;

        while (attempts > 0) {
        System.out.print("Enter Email: ");
        String email = input.nextLine();

        System.out.print("Enter password: ");
        String password = input.nextLine();

        if (email.equals(valid_email) && password.equals(valid_password)) {
            System.out.println("Login successful");
            isLoggedIn = true;
            break;

        } else {
            attempts--;
            System.out.println("Invalid credentials. Attempts left: " + attempts);
        }
    }
        //login fail
        if (!isLoggedIn) {
            System.out.println("Account locked. Too many failed attempts.");
            input.close();
            return;

        }
        //Data collection
        System.out.println("Enter your personal code:");
        final String code= input.nextLine();

        System.out.println("Enter full name:");
        String name= input.nextLine();

        System.out.println("Enter your age:");
        int age= input.nextInt();

        //Grade Verification
        int grade ;
        do {
            System.out.println("Enter your grade (0–100): ");
            grade= input.nextInt();

            if (grade < 0 || grade > 100) {
                System.out.println("Invalid grade. Try again.");

            }

        }while (grade < 0 || grade > 100);

        //Assessment
        String lettergrade;
        if (grade >= 90) {
            lettergrade = "A";

        }else if (grade >= 80) {
            lettergrade = "B";

        }else if (grade >= 70) {
            lettergrade = "c";

        }else if (grade >= 60) {
            lettergrade = "D";

        }else {
            lettergrade = "F";
        }

        //Final
        System.out.println(" Personal Information:");
        System.out.println("code: " + code);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Assessment: " + lettergrade);

        input.close();









    }

}
