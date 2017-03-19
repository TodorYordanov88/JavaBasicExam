package JB15;

import java.util.Scanner;

public class Pr01Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfBookPages = Integer.parseInt(sc.nextLine());
        int campingDays = Integer.parseInt(sc.nextLine());
        int numberOfPagesRead = Integer.parseInt(sc.nextLine());
        int totalDaysToRead = 0;
        if (campingDays >= 30) {
            System.out.println("Never");
        }

        if (campingDays > 0){
            totalDaysToRead = 30 - campingDays;
            numberOfPagesRead = numberOfPagesRead * totalDaysToRead;
            int totalMonthsNeeded = (numberOfPagesRead / numberOfBookPages) * 100;
            System.out.printf("%d years %d months", totalMonthsNeeded / 12, totalMonthsNeeded % 12);
        }
    }
}
