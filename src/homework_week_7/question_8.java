package homework_week_7;

import java.util.Scanner;

public class question_8 {

    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any alphabet:- ");
        char city = sc.next().charAt(0);

        if (city == 'A' || city == 'a') {
            System.out.println("Amreli,Ahamdabad,ankodia,anand");

        } else if (city == 'B' || city == 'b'){

        System.out.println("Borsad,bakrol,baroda");

    } else if (city=='C'  || city=='c') {
            System.out.println("chennai,chakalashi,chanod");

        }else if (city=='D'  || city =='d') {

            System.out.println("Dumral,dabhoi,dabhan");
        }else if (city=='E' ||  city=='e') {

            System.out.println("escot,elora,east putney");
        }
        else if (city =='f' || city=='F'){
            System.out.println("florida,Faizabad,fajitpur");



        }

    }


}
