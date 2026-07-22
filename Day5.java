
public class Day5 {

    public static String reverseString(String S) {

        char[] arr = S.toCharArray();

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {

            if (!Character.isLetter(arr[left])) {
                left++;
            }

            else if (!Character.isLetter(arr[right])) {
                right--;
            }

            else {
                char temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }

        return new String(arr);
    }

    public static void main(String[] args) {

        String S = "A&x#";

        String result = reverseString(S);

        System.out.println(result);
    }
}