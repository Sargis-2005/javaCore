package homework6;

public class CharArrayUtil {
    public static void main(String[] args) {
        char[] chars = {'J', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n', '!'};
//        Խնդիր 1 — Տպել բոլոր սիմվոլները:
        for (char Char : chars) {
            System.out.print(Char);
        }

        System.out.println();
//        Խնդիր 2 — Հաշվել սիմվոլների քանակը:
//        Տպել նաև զանգվածի առաջին և վերջին սիմվոլները։

        int x = 0;
        for (int i = 0; i < chars.length; i++) {
            x++;
        }
        System.out.println("Characters count: " + x);
        System.out.println("First character: " + chars[0]);
        System.out.println("Last character: " + chars[chars.length - 1]);

//       Խնդիր 3 — Հաշվել տրված սիմվոլի հանդիպումների քանակը:
        char target = 'a';
        int y = 0;
        for (char aChar : chars) {
            if (aChar == target) {
                y++;
            }
        }
        System.out.println("Character 'a' count: " + y);
//        Խնդիր 4 — Հաշվել ձայնավորների քանակը:
        int c = 0;
        for (char aChar : chars) {
            if (aChar == 'a' ||
                    aChar == 'A' ||
                    aChar == 'E' ||
                    aChar == 'I' ||
                    aChar == 'O' ||
                    aChar == 'U' ||
                    aChar == 'e' ||
                    aChar == 'i' ||
                    aChar == 'o' ||
                    aChar == 'u') {
                c++;
            }

        }
        System.out.println("Vowels count: " + c);
//        Խնդիր 5 — Հաշվել բաղաձայնների քանակը:
        char n = ' ';
        char q = '!';

        int z = 0;
        for (char aChar : chars) {
            if (aChar != 'a' &&
                    aChar != 'A' &&
                    aChar != 'E' &&
                    aChar != 'I' &&
                    aChar != 'O' &&
                    aChar != 'U' &&
                    aChar != 'e' &&
                    aChar != 'i' &&
                    aChar != 'o' &&
                    aChar != 'u' &&
                    aChar != ' ' &&
                    aChar != '!') {
                z++;
            }


        }
        System.out.println("Consonants count: " + z);
//        Խնդիր 6 — Հաշվել բացատների քանակը։
        int t = 0;
        for (char aChar : chars) {
            if (aChar == n) {
                t++;
            }
        }
        System.out.println("Spaces count " + t);
        //        Խնդիր 7 — Շրջել սիմվոլների հերթականությունը (Reverse)։

        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        for (char aChar : chars) {
            System.out.print(aChar);

        }

        System.out.println();
        for (int i = 0; i < chars.length / 2; i++) {
            char temp = chars[i];
            chars[i] = chars[chars.length - 1 - i];
            chars[chars.length - 1 - i] = temp;
        }

        for (int i = 0; i < chars.length; i++) {
        }


//        Խնդիր 8 — Փոխել մեծատառերը և փոքրատառերը:

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'a' && chars[i] <= 'z') {
                chars[i] = (char) (chars[i] - 32);
            }

        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);

        }
        System.out.println();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] >= 'A' && chars[i] <= 'Z') {
                chars[i] = (char) (chars[i] + 32);
            }

        }
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i]);

        }
        System.out.println();
        // Խնդիր 9 — Փոխարինել տրված սիմվոլը:
        char replaceTarget = 'a';
        char replacement = '*';
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] ==replaceTarget) {
                chars[i] = replacement;
            }
            System.out.print(chars[i]);

        }
        System.out.println();
//        Խնդիր 10 — Ստուգել Palindrome-ը:
        boolean isPalindrome = true;
        for (int i = 0; i < chars.length / 2; i++) {
            if (chars[i] != chars[chars.length - 1 - i]) {
                isPalindrome = false;
                break;
            }


        }
        System.out.println("isPalindrome: " + isPalindrome);
//        Bonus 1 — Գտնել սիմվոլի առաջին հանդիպման ինդեքսը:
        char[] chars1 = {'a', 'b', 'c', 'd'};
        char target1 = 'a';
        int index = -1;
        for (int i = 0; i < chars1.length; i++) {


            if (chars1[i] == target1) {
                index = i;
                break;
            }
        }
        System.out.println("Bonus 1 First index: " + index);
//        Bonus 2 — Համեմատել երկու char զանգված:
        boolean f = true;
        char[] m = {'J', 'a', 'v', 'a'};
        char[] u = {'J', 'a', 'v', 'a'};
        if (m.length != u.length) {
            f = false;
        } else {
            for (int i = 0; i < m.length; i++) {
                if (m[i] != u[i]) {
                    f = false;
                    break;
                }
            }
        }
        System.out.print("Bonus 2 Arrays are equal: " + f);
        System.out.println();
//        Bonus 3 — Հեռացնել կրկնվող սիմվոլները:
        char[] chars2 = {'a', 'b', 'a', 'c', 'b', 'd', 'a'};

        for (int i = 0; i < chars2.length; i++) {
            int e = 0;
            for (int j = 0; j < i; j++) {
                if (chars2[i] == chars2[j]) {
                    e++;
                }

            }
            if (e == 0) {

                System.out.print(chars2[i] + " ");
            }
        }

    }
}










