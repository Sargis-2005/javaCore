package homework;

public class ArraySortingHomework {
    public static void main(String[] args) {
//        Խնդիր 1 - Սորտավորել զանգվածը փոքրից մեծ։
        int[] numbers = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {
                if (numbers[i] > numbers[j]) {
                    int x = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = x;
                }


            }
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        //        Խնդիր 2 - Սորտավորել զանգվածը մեծից փոքր։
        int[] nums = {12, 5, 8, -3, 21, 7, 0, 15, 2, 9};
        for (int i = 0; i <nums.length ; i++) {
            for (int j = i+1; j <nums.length ; j++) {
                if (nums[i] <nums[j]) {
                    int x = nums[i];
                    nums[i] = nums[j];
                    nums[j] = x;
                }

            }
            System.out.print(nums[i]+ " ");
        }
    }
}
