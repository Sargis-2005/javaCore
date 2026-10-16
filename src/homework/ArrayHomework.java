package homework;

public class ArrayHomework {
    public static void main(String[] args) {
//        Խնդիր 1 — Հաշվել տվյալ թվի հանդիպումների քանակը
        int[] numbers = {6, 3, 8, 6, 1, 9, 6, 4, 2, 6};
        int p = 0;
        for (int i = 0; i < numbers.length; i++) {
            int n = 6;
            if (numbers[i] == n) {
                p++;
            }


        }
        System.out.print("Count of 6 :" + p);
        System.out.println();
//        Խնդիր 2 — Շրջել զանգվածի էլեմենտների հերթականությունը
        int[] k = {1, 5, 8, 3, 9, 2, 7, 4, 6, 10};
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(k[i] + " ");

        }
        System.out.println();
//        Խնդիր 3 — Հաշվել կրկնվող թվերի քանակը

        int[] j = {3, 6, 8, 3, 9, 6, 2, 3, 5, 6};
        int q = 0;
        int y = 0;
        for (int i = 0; i < j.length; i++) {
            for (int l = 0; l < i; l++) {
                if (j[i] == j[l]) {
                    y++;
                }

            }
            if (y == 0) {
                for (int l = i + 1; l < j.length; l++) {
                    if (j[i] == j[l]) {
                        q++;
                        break;
                    }

                }

            }


        }
        System.out.println("Repeated numbers count: " + q);
//        Խնդիր 4 — Հաշվել ձայնավորների քանակը
        char[] chars = {'բ', 'ա', 'ր', 'և', 'ա', 'շ', 'խ', 'ա', 'ր', 'հ'};
        int x = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'ա' ||
                    chars[i] == 'ո' ||
                    chars[i] == 'ե' ||
                    chars[i] == 'է' ||
                    chars[i] == 'օ' ||
                    chars[i] == 'ը' ||
                    chars[i] == 'ի') {
                x++;
            }


        }

        System.out.println("Vowels count: " + x);
//        Bonus 1 — Գտնել երկրորդ ամենամեծ թիվը
        int[] e = {4, 9, 2, 15, 7, 15, 3, 11, 6, 8};
        int max = e[0];
        int secondMax = e[0];
        for (int i = 0; i < 10; i++) {
            if (e[i] > max) {
                max = e[i];
            } else if (e[i] > secondMax && max != e[i]) {
                secondMax = e[i];

            }
        }
        System.out.println("Second maximum: " + secondMax);
//        Bonus 2 — Հեռացնել կրկնվող թվերը
        int[] a = {3, 6, 3, 8, 9, 6, 2, 3, 5, 6};

        for (int i = 0; i < 10; i++) {
            int g = 0;
            for (int l = 0; l < i; l++) {
                if (a[i] == a[l]) {
                    g++;
                }

            }
            if (g == 0) {
                System.out.print(a[i] + " ");

            }

        }
        System.out.println();
        int[] v = {3, 6, 3, 8, 9, 6, 2, 3, 5, 3};
        int maxcount = 0;
        int mostfrequent= 0;
        for (int i = 0; i < v.length; i++) {
            int m = 0;
            for (int l = 0; l < v.length; l++) {
                if (v[i]==v[l]){
                    m++;
                }
                if (m>maxcount){
                    maxcount=m;
                    mostfrequent=v[i];
                }

            }


        }
        System.out.println("Count: " +  maxcount);
        System.out.println("Most frequent number: " + mostfrequent);
    }
}














