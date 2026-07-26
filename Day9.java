import java.util.*;

class Day9 {

    static String minimumLuckyNumber(int N) {

        int best4 = -1;
        int best7 = -1;
        int minDigits = Integer.MAX_VALUE;
        for (int count4 = 0; count4 <= N / 4; count4++) {

            int remaining = N - (count4 * 4);
            if (remaining >= 0 && remaining % 7 == 0) {

                int count7 = remaining / 7;
                int totalDigits = count4 + count7;
                if (totalDigits < minDigits) {
                    minDigits = totalDigits;
                    best4 = count4;
                    best7 = count7;
                }
            }
        }
        if (best4 == -1) {
            return "-1";
        }

        StringBuilder ans = new StringBuilder();

       
        for (int i = 0; i < best4; i++) {
            ans.append('4');
        }

        for (int i = 0; i < best7; i++) {
            ans.append('7');
        }

        return ans.toString();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int N = sc.nextInt();

        String result = minimumLuckyNumber(N);

        System.out.println("Minimum Lucky Number: " + result);

        sc.close();
    }
}