package CollectionTasks;

import java.util.Stack;

public class DecodeString {
    public static String decode(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int k = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                // build number (e.g. 12[AB] → 12)
                k = k * 10 + (ch - '0');
                System.out.println(k);

            }
            else if (ch == '[') {
                // push current count and current string
                counts.push(k);
                resultStack.push(current);
                // reset for new substring
                k = 0;
                current = new StringBuilder();
            }
            else if (ch == ']') {
                // finished one bracket → repeat
                int repeatTimes = counts.pop();
                StringBuilder decoded = resultStack.pop();
                for (int i = 0; i < repeatTimes; i++) {
                    decoded.append(current);
                }
                current = decoded;
            }
            else {
                // normal character → append
                current.append(ch);
            }
        }
        return current.toString();
    }

    public static void main(String[] args) {
        String input = "2[AB2[C]]";
        String output = decode(input);
        System.out.println("Input  : " + input);
        System.out.println("Output : " + output);
    }
}
