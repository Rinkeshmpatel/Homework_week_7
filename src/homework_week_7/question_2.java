package homework_week_7;

import java.util.Scanner;

public class  question_2 {

    public static void main (String [] args){
     Scanner sca = new Scanner (System.in);
     int year ;

        System.out.print("Enter a Year -:: ");
        year = sca.nextInt();

        if (((year % 4 ==0) && (year % 100!= 0)) || (year%400 == 0))
            System.out.println("Specified year is a leap year");
        else
            System.out.println("Specified year is not a leap year");

    }
}
