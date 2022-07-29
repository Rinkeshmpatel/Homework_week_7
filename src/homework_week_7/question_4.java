package homework_week_7;

public class question_4 {

    public static void main(String[] args) {
        question_4 q4 = new question_4();
        q4.isleapYear(2000);
        q4.getDaysInMonth(2, 2021);
    }

    public static void isleapYear(int year) {
        boolean result;
        if (year < 1 || year > 9999) {
            System.out.println("not in range");
        } else {

            if ((0 == (year % 4)) && (0 != (year % 100)) || (0 == (year % 400)))
                System.out.println("This is a leap year");
            else {
                System.out.println("This is not a leap year");

            }

        }
    }


        public static void getDaysInMonth(int month, int year)
    {
        int n1 = month;
        int y1 = year;
        switch (n1)
        {
            Case1:
            System.out.println("Janauary" + y1 + "31");
            break;
            case2:
            System.out.println("February"+ y1 + "Either 28 or 29 days in");
            break;
            case3:
            System.out.println("March"  + y1 + "it hase 31 days");
            break;
            case4:
            System.out.println("April"  + y1  + "It has 30 days");
            break;
            case5:
            System.out.println("May"  + y1 + "It has 31 days");
            break;
            case6:
            System.out.println("Jun"  + y1 + "It hase 30 days");
            break;
            case7:
            System.out.println("July"  + y1 + "It hase 30 days");
            break;
            case8:
            System.out.println("August"  + y1 + "It hase 31 days");
            break;
            case9:
            System.out.println("September"  + y1 + "It hase 30 day");
            break;
            System.out.println("October"  + y1 + "It hase 31 days" );
            break;
            case10:
            System.out.println("November"  + y1 + "It hase 30 days");
            break;
            case11:
            System.out.println("December"  + y1 + "It hase 31 days");


            break;
            default:
                throw new IllegalStateException("Unexpected value: " + n1);
        }
    }
}
