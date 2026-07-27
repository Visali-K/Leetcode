import java.util.Scanner;
import java.util.Stack;

public class Day2 {

    public static int maxLength(String s) {

        Stack<Integer> st = new Stack<>();
        st.push(-1); 

        int max = 0;

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                st.pop();

                if (st.isEmpty()) {
                    st.push(i); 
                } else {
                    max = Math.max(max, i - st.peek());
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the parentheses string: ");
        String s = sc.nextLine();

        int ans = maxLength(s);

        System.out.println("Longest Valid Parentheses Length: " + ans);

        sc.close();
    }
}
