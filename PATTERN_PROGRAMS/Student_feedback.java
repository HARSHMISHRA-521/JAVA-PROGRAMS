package PATTERN_PROGRAMS;

import java.util.Scanner;
public class Student_feedback {
    public static void main(String[]args) {
        int n;
        do {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the marks of the student : ");
            int marks = s.nextInt();
            if (marks >= 90) {
                System.out.println("very good");
            } else if (marks >= 70 && marks < 90) {
                System.out.println("good ");
            } else {
                System.out.println("no problem! try again fail better");
            }
            System.out.println("Enetr your choice (1/0)\n1.for continuing\n0.for terminating");
            n = s.nextInt();
        } while (n != 0);
    }
}
