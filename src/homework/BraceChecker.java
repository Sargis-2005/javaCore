package homework;

public class BraceChecker {
    private String text;

    public BraceChecker(String text) {
        this.text = text;
    }

    public boolean check() {
        Stack myStack = new Stack(text.length());
        for (int i = 0; i < text.length(); i++) {
            char content = text.charAt(i);
            if (content == '{' || content == '[' || content == '(') {
                myStack.push(content);
            } else if (content == '}' || content == ']' || content == ')') {
                if (myStack.isEmpty()) {
                    System.out.println("Error: closed " + content + " but not opened at " + i);
                    return false;
                }
                char lastElement = myStack.pop();
                if (content == '}' && lastElement != '{') {
                    System.out.println("Error: opened " + lastElement + " but closed " + content + " at " + i);
                    return false;
                } else if (content == ']' && lastElement != '[') {
                    System.out.println("Error: opened " + lastElement + " but closed " + content + " at " + i);
                    return false;
                } else if (content == ')' && lastElement != '(') {
                    System.out.println("Error: opened " + lastElement + " but closed " + content + " at " + i);
                    return false;
                }
            }
        }
        if (!myStack.isEmpty()) {
            while (!myStack.isEmpty()) {
                char unclosed = myStack.pop();
                System.out.println("Error: opened " + unclosed + " but never closed");
                return false;
            }

        }
        return true;
    }
}

