package homeworks;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] numbers = {1, 6, 3, 9, 15, 52, -3, 5, 8};
//        Խնդիր 1 - Տպել զանգվածի բոլոր էլեմենտները
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        {
//        Խնդիր 2 - Տպել առաջին էլեմենտը
            System.out.println("First element:" + " " +  numbers[0]);
        }
        {
//        Խնդիր 3 - Տպել վերջին էլեմենտը
            System.out.println("Last element:" + " " + (numbers.length - 1));

        }
        {
//        Խնդիր 4 - Տպել զանգվածի երկարությունը
            System.out.println("Array length:" + " " + numbers.length);
        }
        {
//        Խնդիր 5 - Գտնել ամենափոքր թիվը
            int min = numbers[0];
            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                    System.out.println("Minimum number: " + " " + numbers[i]);
                }

            }

        }
        {
//        Խնդիր - 6 - Տպել զանգվածի մեջտեղի էլեմենտը կամ էլեմենտները
            System.out.println("Middle element:" + " " + numbers[numbers.length / 2]);
        }

        {
//        Խնդիր 7 - Հաշվել զույգ թվերի քանակը
            int k = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 == 0) {
                    k++;
                }
            }

            System.out.println("Even numbers count:" + " " + k);
        }

        {
//       Խնդիր 8 - Հաշվել կենտ թվերի քանակը
            int k = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] % 2 != 0) {

                    k++;
                }
            }
            System.out.println("Odd numbers count:" + " " + k);

        }
        {
//       Խնդիր 9 - Հաշվել զանգվածի էլեմենտների գումարը
            int sum = 0;
            for (int i = 0; i < numbers.length; i++) {
                sum += numbers[i];

            }
            System.out.println("Sum:" + " " + sum);


            {
//       Խնդիր 10 - Հաշվել միջին թվաբանականը
                int count;
                count = numbers.length;
                double k;
                k = (double) sum / count;


                System.out.println("Average:" + " " + k);

            }



        }
//        bonus 1 - գտնել ամենամեծ թիվը
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum number:" + " " + max);
        {
//        bonus 2 - Հաշվել դրական և բացասական թվերը
            int p = 0;
            int q = 0;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] > 0) {
                    p++;
                } else if (numbers[i] < 0)
                    q++;
            }
            System.out.println(p);
            System.out.println(q);

        }
        {
//        bonus 3 - Տպել զանգվածը հակառակ ուղղությամբ
            for (int i = numbers.length-1; i >=0 ; i--) {
                System.out.print(numbers[i] + " ");

            }

        }

    }



    }















