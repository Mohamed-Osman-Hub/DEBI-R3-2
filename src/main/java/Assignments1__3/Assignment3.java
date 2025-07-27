package Assignments1__3;

import java.util.Scanner;

public class Assignment3 {

    //  Definition of constant values
    static final String VALID_EMAIL = "mohamed@intrast.com";
    static final String VALID_PASSWORD = "mohamed123";

    static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
        boolean success = login();

        if (!success) {
            System.out.println(" Account locked. Too many failed attempts.");
            input.close();
            return;
        }

        // Data collection
        final String code = getPersonalCode();
        String name = getFullName();
        int age = getAge();
        int grade = getValidGrade();

        // evaluateGrade
        String letter = evaluateGrade(grade);


        printSummary(code, name, age, grade, letter);

        input.close();
    }


    // Login
    public static boolean login() {
        int attempts = 3;

        while (attempts > 0) {
            System.out.print("Enter email: ");
            String email = input.nextLine();

            System.out.print("Enter password: ");
            String password = input.nextLine();

            if (email.equals(VALID_EMAIL) && password.equals(VALID_PASSWORD)) {
                System.out.println(" Login successful!");
                return true;
            } else {
                attempts--;
                System.out.println(" Invalid credentials. Attempts left: " + attempts);
            }
        }

        return false;
    }


    // Code
    public static String getPersonalCode() {
        System.out.print("Enter your personal code (will remain constant): ");
        return input.nextLine();
    }


    // Name
    public static String getFullName() {
        System.out.print("Enter full name: ");
        return input.nextLine();
    }


    // Age
    public static int getAge() {
        System.out.print("Enter age: ");
        int age = input.nextInt();
        input.nextLine();
        return age;
    }


    // Grade Verification
    public static int getValidGrade() {
        int grade;
        do {
            System.out.print("Enter your grade (0–100): ");
            grade = input.nextInt();
            input.nextLine();

            if (grade < 0 || grade > 100) {
                System.out.println(" Invalid grade. Please enter a number between 0 and 100.");
            }
        } while (grade < 0 || grade > 100);

        return grade;
    }



    public static String evaluateGrade(int grade) {
        if (grade >= 90) {
            return "A";
        } else if (grade >= 80) {
            return "B";
        } else if (grade >= 70) {
            return "C";
        } else if (grade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }


    // printSummary
    public static void printSummary(String code, String name, int age, int grade, String letter) {
        System.out.println(" Personal Information:");
        System.out.println("Code   : " + code);
        System.out.println("Name   : " + name);
        System.out.println("Age    : " + age);
        System.out.println("Grade  : " + grade);
        System.out.println("Letter : " + letter);
    }


}


