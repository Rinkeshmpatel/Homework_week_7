package homework_week_7;
import java.util.Scanner;

public class question_6 {

        public static void main(String[] args) {
            Scanner risk = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = risk.nextInt();

            if(num % 2 == 0)
                System.out.println(" Entered number is even");
            else
                System.out.println(" Entered number is odd");
        }
    }

