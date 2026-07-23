import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

class Day6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();

      
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();

    
        LocalDate date1 = LocalDate.of(y1, m1, d1);
        LocalDate date2 = LocalDate.of(y2, m2, d2);

      
        long days = ChronoUnit.DAYS.between(date1, date2);

       
        System.out.println(Math.abs(days));

        sc.close();
    }
}