import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class hw_String {
    // 1.Given string “Algorithms”, return “go” and “Algo” using substring
    public void subString() {
        String input = "Algorithms";
        System.out.println(input.substring(2, 4) + " " + input.substring(0, 4));
    }

    // 2.Given two strings, compare if these two strings are equal by comparing each
    // character
    public boolean isEqual(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        }
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    // 3.Given string “https://www.amazon.com/demo?test=abc”,
    // return [“https”,”www”,”amazon”,”com”,”demo”,”test”,”abc”]
    public List spilitString(String str) {
        List<String> list = new ArrayList<>();
        StringTokenizer stk = new StringTokenizer(str, "://.?=");
        while (stk.hasMoreTokens()) {
            list.add(stk.nextToken());
        }
        return list;
    }

    // 4.Given a list of string array, combine them into one string sentence, return
    // the string sentence
    private static String combineStrings(List<String[]> list) {
        StringBuilder res = new StringBuilder();
        for (String[] arr : list) {
            for (String s : arr) {
                res.append(s);
            }
        }
        return res.toString();
    }
}