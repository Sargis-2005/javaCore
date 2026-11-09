package homework;

public class Stack {
    private char[] array;
    private int top;

    public Stack(int n) {
        array = new char[n];
        top = -1;
    }

    public void push(char c) {
        top++;
        array[top] = c;
    }

    public char pop() {
        char c = array[top];
        top--;
        return c;

    }

    public boolean isEmpty() {
        return top == -1;

    }
}

