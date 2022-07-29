package homework_week_7;

public class question_19 {
    public static void main(String[] args) {

        int[] numbers = new int[]{11, 31, 36, 50, 85, 95, 120};
        int sum = 0;
        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];
        //calculate average value
        double avg = sum / numbers.length;
        System.out.println("Average value of the array elements is : " + avg);
    }
}

