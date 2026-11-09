package homework;

public class BraceCheckerTest {
    public static void main(String[] args) {
        BraceChecker test1 = new BraceChecker("Hello from [Java]");
        boolean result = test1.check();
        System.out.println(result);
        BraceChecker test2 = new BraceChecker("{Hello (Java)}");
        result = test2.check();
        System.out.println(result);
        BraceChecker test3 = new BraceChecker("{[()]}");
        result = test3.check();
        System.out.println(result);
        BraceChecker test4 = new BraceChecker("Hello Java");
        result = test4.check();
        System.out.println(result);
        BraceChecker test5 = new BraceChecker("Hello from [Java)");
        result = test5.check();
        System.out.println(result);
        BraceChecker test6 = new BraceChecker("{[(])}");
        result = test6.check();
        System.out.println(result);
        BraceChecker test7 = new BraceChecker("Hello from Java]");
        result = test7.check();
        System.out.println(result);
        BraceChecker test8 = new BraceChecker("{Hello Java");
        result = test8.check();
        System.out.println(result);
        BraceChecker test9 = new BraceChecker("((()))");
        result = test9.check();
        System.out.println(result);
        BraceChecker test10 = new BraceChecker("(()");
        result = test10.check();
        System.out.println(result);
    }
}
