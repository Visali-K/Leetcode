import java.util.*;

class Day11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[n][2];
        for (int i = 0; i < n; i++) {
            a[i][0] = sc.nextInt();
            a[i][1] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[][] b = new int[m][2];

        for (int i = 0; i < m; i++) {
            b[i][0] = sc.nextInt();
            b[i][1] = sc.nextInt();
        }

        int i = 0;
        int j = 0;
        while (i < n && j < m) {
            int start = Math.max(a[i][0], b[j][0]);
            int end = Math.min(a[i][1], b[j][1]);

            if (start <= end) {
                System.out.print("{" + start + ", " + end + "} ");
            }

            if (a[i][1] < b[j][1]) {
                i++;
            } else {
                j++;
            }
        }
    }
}