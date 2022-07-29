package homework_week_7;

import java.util.Scanner;

public class question_1{

    public static void main(String []args){
            Scanner sc = new Scanner(System.in);
            System.out.print("Please enter a number : ");

            int number = sc.nextInt();
            String result = (number % 2==0 ? "even" : "odd"); //ternary operator to check number
            System.out.println(number + " is " + result);

        }
    }


