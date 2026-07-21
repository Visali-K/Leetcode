import java.util.*;

public class Day4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

       
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

       
        System.out.print("Enter k: ");
        int k = sc.nextInt();

       
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int x : nums) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }

        
        Integer[] arr = new Integer[map.size()];

        int index = 0;
        for (int x : map.keySet()) {
            arr[index++] = x;
        }

        Arrays.sort(arr, (a, b) -> map.get(b) - map.get(a));

        // 
        System.out.println("Top " + k + " frequent elements:");

        for (int i = 0; i < k; i++) {
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}