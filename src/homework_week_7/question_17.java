package homework_week_7;

import java.util.Arrays;

public class question_17 {

    public static void main(String [] patel){

        int [] numeric  = {100, 200, 300, 400, 500, 600};
        String [] name={"America","Japan","India","Kenya","Uganda","Rwanda","peru"};

        System.out.println("Original numeric array :- "+ Arrays.toString(numeric));
        Arrays.sort(numeric);
        System.out.println("Sorted numeric Array :- "+ Arrays.toString(numeric));

        System.out.println("Original name array :- "+ Arrays.toString(name));
        Arrays.sort(name);
        System.out.println("Sort Array" + Arrays.toString(name));

    }
}
