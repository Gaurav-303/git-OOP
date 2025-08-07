package studentgradingsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int n = sc.nextInt();
        sc.nextLine();

        Subject[] subjects = new Subject[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter subject name: ");
            String subName = sc.nextLine();
            System.out.print("Enter marks for " + subName + ": ");
            int marks = sc.nextInt();
            sc.nextLine();
            subjects[i] = new Subject(subName, marks);
        }

        Student student = new Student(name, roll, subjects);
        ReportCard report = new ReportCard(student);
        report.printReport();

        sc.close();
    }
}

