package homework_week_7;

public class question_20 {
    public static boolean contains(int[] arr, int item) {
        for (int num : arr) {
            if (item == num) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] my_array1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(contains(my_array1, 20));
        System.out.println(contains(my_array1, 30));
    }
}

