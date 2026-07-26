import java.util.Scanner;

public class Day3 {
    public static int lengthOfLastWord(String s) {
       
         s = s.trim();

        int lastSpace = s.lastIndexOf(' ');

        String lastWord = s.substring(lastSpace + 1);

        return lastWord.length(); 
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        int result = lengthOfLastWord(s);

        System.out.println("Length of last word: " + result);

        sc.close();
    }
}