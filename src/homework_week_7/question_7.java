package homework_week_7;
//Write a java program input sales id, seller's name,
// sales amount, and salary basic and then fined this sales

import java.util.Scanner;

public class question_7 {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Saler ID :-");
        int id = sc.nextInt();
        System.out.println("Enter Saller Name :-");
        String name = sc.next();
        System.out.println("Enter Salary basic :- ");
        double sbasic = sc.nextDouble();
        System.out.println("Enter Sales amount :- ");
        double amount = sc.nextDouble();

        if (amount >= 50000) {

            System.out.println("Sales Commission is :- " + (amount * 35 / 100));
        } else if (amount < 50000 && amount > 30000) {

            System.out.println("Sales Commission is :- " + (amount * 25 / 100));
        } else if (amount < 30000 && amount > 20000) {

            System.out.println("Sales Commission is :- " + (amount * 10) / 100);

        } else if (amount < 20000 && amount > 10000) {
            System.out.println("Enter Commission  is :- " + (amount * 2 / 100));

        } else if (amount < 3000 && amount >= 20000) {

            System.out.println("No Commission");


        }
    }

    }



