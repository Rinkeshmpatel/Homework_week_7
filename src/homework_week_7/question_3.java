package homework_week_7;

import java.util.Scanner;
public class question_3 {
            public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.print("      Mark Sheet       : ");
            String n = in.nextLine();
            System.out.print("Enter Name : ");
            int c = in.nextInt();
            System.out.print("Enter roll no of student: ");
            int r = in.nextInt();
            System.out.print("Enter marks Mathematics: ");
            int m1 = in.nextInt();
            System.out.print("Enter marks science: ");
            int m2 = in.nextInt();
            System.out.print("Enter marks English: ");
            int m3 = in.nextInt();
            int t = m1 + m2 + m3;
            double p = t / 500.0 * 100.0;
            String g = "";
            if (p >= 90)
                g = "A+";
            else if (p >= 80)
                g = "A";
            else if (p >=70)
                g = "B+";
            else if (p >= 60)
                g = "B";
            else if (p >= 50)
                g = "C";
            else if (p >= 40)
                g = "D";
            else
                g = "E";

            System.out.println("Total Marks = " + t);
            System.out.println("Percentage = " + p);
            System.out.println("Grade = " + g);
        }
    }

