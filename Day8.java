import java.util.*;

public class Main {

    public static void moveZerosToLeft(int[] arr) {

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (arr[left] == 0 && arr[right] != 0) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
            else if (arr[left] == 0 && arr[right] == 0) {
                right--;
            }
            else {
                left++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {0, 1, 0, 10, 9, 0, 0, 2};

        moveZerosToLeft(arr);

        System.out.println(Arrays.toString(arr));
    }
}