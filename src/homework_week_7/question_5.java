package homework_week_7;

import java.util.Scanner;

public class question_5 {

    public static void main(String [] args){
        Scanner payslip = new Scanner(System.in);
        System.out.println("-----------------------------------------");
        System.out.println("|          Salary Slip  :-               |");
        System.out.println("|                                        |");
        System.out.println("------------------------------------------");
        System.out.println("|Employ Id :-                            |");
        int s1 = payslip.nextInt();
        System.out.println("|Employ Name                             |");
        String s2 = payslip.next();
        System.out.println("                                          ");
        System.out.println("------------------------------------------");
        System.out.println("|Basic sallery                 :         |");
        double Bsallery = payslip.nextDouble();
        double HRA = 10*Bsallery/100;
        System.out.println("|HRA  :-                       :"+HRA+"   |");
        double DA = 8*Bsallery/100;
        System.out.println("|DA                            :  " + DA  );
        double TA = 9*Bsallery/100;
        System.out.println("|TA                            :    "+ TA );
        double PF = 20*Bsallery/100;
        System.out.println("|PF                            : "   + PF );
        double Grospay = Bsallery+HRA+TA+DA-PF;
        System.out.println("|-----------------------------------------|");
        System.out.println("|Gross Pay                     :"    +Grospay);
        System.out.println("|---------------------------------------|");
        System.out.println("|---------------------------------------|");


    }
}
