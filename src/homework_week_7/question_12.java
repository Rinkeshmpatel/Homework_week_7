package homework_week_7;
//  Write a program that tells us input value is number or an alphabet or symbol.


import java.util.Scanner;
public class question_12 {
    public static void main(String []args)
        {
            Scanner sc=new Scanner(System.in);
            char ch;     //Declare a character
            System.out.println("Enter the character ");
            ch=sc.next().charAt(0);   //Initialize the character
            if((ch>=97 && ch<=122)||(ch>=65 && ch<=90))  //check whether alphabet or not using if-else statement
            {
                System.out.print(ch+" is an Alphabet");
            }
            else
            {
                System.out.print(ch+" is not an Alphabet");
            }
        }

    }

