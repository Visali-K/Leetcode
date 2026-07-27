import java.util.*;

class Day7 {

    public static String encode(String s) {

        int count = 1;
        String s1 = ""; 

        for (int i = 0; i < s.length() - 1; i++) {

            char ch = s.charAt(i);

            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } 
            else {
                s1 += count;
                s1 += ch;
                count = 1;
            }
        }

        // Always add the last group
        s1 += count;
        s1 += s.charAt(s.length() - 1);

        return s1;
    }

    public static void main(String[] args) {

        String s = "AAAABBBCCDAA";

        String result = encode(s);

        System.out.println(result);
    }
}
