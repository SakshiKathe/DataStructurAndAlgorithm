package TopicStacks;

import java.util.*;

public class AssTwo {
    public static String simplify(String str) {
        Stack<String> s = new Stack<>();
        String res = "";
        res += "/";

        for (int i = 0; i < str.length(); i++) {
            String dir = "";
            while (i < str.length() && str.charAt(i) == '/') {
                i++;
            }
            while (i < str.length() && str.charAt(i) != '/') {
                dir += str.charAt(i);
                i++;
            }
            if (dir.equals("..") == true) {
                if (!s.empty()) {
                    s.pop();
                }
            } else if (dir.equals(".") == true) {
                continue;
            } else if (dir.length() != 0) {
                s.push(dir);
            }
        }
        Stack<String> s1 = new Stack<>();
        while (!s1.empty()) {
            s1.push(s.pop());
        }
        while (!s1.empty()) {
            if (s1.size() != 1) {
                res += (s1.pop() + "/");
            } else {
                res += s1.pop();
            }
        }
        return res;
    }

    public static void main(String[] args) {
        String str = new String("/a/..");
        String res = simplify(str);
        System.out.println(res);
    }
}
